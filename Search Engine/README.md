<h1 align="center">SmartSearch: TF-IDF Driven Document Search Engine</h1>

<p align="right"><b>By: Mustafa Shabbir Bhavanagarwala</b></p>

## About the project:
<p>In this project, a search application is built that uses TF-IDF to compute the “relevance” of a 
document to a search query and it displays the most relevant documents. The data sets are 
uploaded to S3. The S3 data sources are imported to create DynamoDB tables, to hold the 
data. Python code is implemented for the search relevance formula. The lambda function is 
created that incorporates search relevance code to accept a query string as input and 
produce HTML as output.</p>
<p>The project also implements TF-IDF calculations using Spark RDDs and Spark DataFrames. 
The approach using Spark RDDs involves calculating the Term Frequency-Inverse Document 
Frequency for terms across a corpus of documents. It first computes term frequencies and 
document frequencies, then joins them to calculate TF-IDF values. Finally, the results are 
joined with a sample set of terms and documents for further analysis and sorted for 
presentation.</p>
<p>In the case of Spark Dataframes, two phases which are the indexing phase and the query 
phase are implemented. A function named ‘relevance’ is built where the query is a string of query 
words, and the index is a data frame produced by the ‘indexDocuments’ function.</p>
<p>The project has significant use in Enterprise Search Solutions, E-commerce Platforms, 
Content Management Systems, Digital Libraries for retrieving relevant documents.</p>
<p>Technology: Python, Apache Spark, AWS: EMR, AWS: Cloudshell, DynamoDB</p>

**Note for Windows Users: This repo may contain long file paths**

If you download this repository as a ZIP, you may encounter **"Path Too Long"** errors when extracting on Windows.

To avoid issues:

- ✅ Use **[7-Zip](https://www.7-zip.org/)** to extract the ZIP file instead of the default Windows extractor.
      Save the ZIP to a short path like `C:\z\` before extracting.
- ✅ Alternatively, **clone the repository** using Git to avoid path length limitations:
  ```bash
  git clone https://github.com/Mustafa-Shabbir-Bhavanagarwala/Projects.git


