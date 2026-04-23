# Install libraries 

import pandas as pd
import openai
import chainlit as cl
from sentence_transformers import SentenceTransformer
import faiss
import numpy as np

# Set up OpenAI API key

# Load CSV dataset
data = pd.read_csv('Final_Sentiment_Results_Costco.csv')

# Use 'productName' + 'comment_body' + 'comment_year' + 'comment_month' for review text and 'sentiment_twitter_roberta' for sentiment labels
texts = (data['productName'].fillna('') + ' ' + data['comment_body'].fillna('') + ' ' + data['comment_year'].astype(str).fillna('') + ' ' + data['comment_month'].astype(str).fillna('')).fillna('')
sentiments = data['sentiment_twitter_roberta'].fillna('')

# Create embeddings for the combined text
embedder = SentenceTransformer('all-MiniLM-L6-v2')
corpus_embeddings = embedder.encode(texts.tolist(), show_progress_bar=True)

# Build FAISS index for fast retrieval
embedding_dim = corpus_embeddings.shape[1]
index = faiss.IndexFlatL2(embedding_dim)
index.add(np.array(corpus_embeddings))

def ask_gpt4o(context, question):
    # Debug: Print the context and question being sent to GPT-4o
    print("\n Sending to GPT-4o \n")
    print("CONTEXT:\n", context[:500])
    print("QUESTION:\n", question)

    # Prepare messages for GPT-4o
    messages = [
        {"role": "system", "content": "You are a helpful assistant answering questions based on Costco product reviews and their sentiment classification."},
        {"role": "user", "content": f"Based on the following product reviews and their sentiment labels:\n{context}\n\nAnswer the question: {question}"}
    ]

    # Call OpenAI's GPT-4o API
    response = openai.ChatCompletion.create(
        model="gpt-4o",
        messages=messages,
        temperature=0.2
    )

    # Debug: Print the response received from GPT-4o
    print("\n GPT-4o RESPONSE \n")
    print(response['choices'][0]['message']['content'])

    return response['choices'][0]['message']['content']

@cl.on_message
async def main(message: cl.Message):
    # Get user input
    user_input = message.content

    # Embed the user question
    question_embedding = embedder.encode([user_input])

    # Retrieve top 5 most relevant reviews
    distances, indices = index.search(np.array(question_embedding), k=5)

    matched_texts = []
    for idx in indices[0]:
        review_text = texts.iloc[idx]
        sentiment_label = sentiments.iloc[idx]
        matched_texts.append(f"Review: {review_text}\nSentiment: {sentiment_label}")

    # Combine retrieved reviews and their sentiments
    context = "\n\n".join(matched_texts)

    # Get the answer from GPT-4o and send it back
    answer = ask_gpt4o(context, user_input)
    await cl.Message(content=answer).send()

