import boto3
import termify

###############################################
#  Entry point is a function search(line) where line is the 
#    input query.  Output is a sequence of the form (docname, relevance) of 
#    length at most 5, and sorted in descending order of relevance


#  Step 1 -- Make connections to the two dynamodb tables
tfidf_table = boto3.resource('dynamodb').Table("tfidf4")
docid_table = boto3.resource('dynamodb').Table("doctitle")

###################################################
#  These three functions do the dynamodb lookups.  


# get_docids_for_terms
# Input is a sequence of terms.  Output is a set of docids -- the set of 
#  all docids that contain one or more of the terms

def get_docids_for_terms(terms):
    docids = set()
    for term in terms:
        #  dynamodb call to get all docids for that term, and add them to the set
        query_params = {
        'KeyConditionExpression': 'term = :tm ',
        'ExpressionAttributeValues': {':tm': term },
        'ProjectionExpression': 'docid'}
        response = tfidf_table.query(**query_params)
        all_items= response['Items']
        for item in all_items:
            docids.add(item['docid'])

    return docids
 
# get_tfidf
#  Input is a term and docid, output is the stored TF-IDF value for
#  that pair, or 0.0 if there is no stored value
 
def get_tfidf(term, docid):
    query_params = {
        'KeyConditionExpression': 'term = :tm AND docid=:id',
        'ExpressionAttributeValues': {':tm': term, ':id': docid },
        'ProjectionExpression': 'tfvalue'}

    response = tfidf_table.query(**query_params)
    all_items= response['Items']
    if len(all_items) == 0:
        return 0.0
    else:
        return float(all_items[0]['tfvalue'])





# get_doc_title
#   Input is a docid, output is the stored name (title) for the document as stored in Dynamodb, or None if 
#     there is no such entry

def get_doc_title(docid):
    query_params = {
        'KeyConditionExpression': 'docid = :id',
        'ExpressionAttributeValues': {':id': docid},
        'ProjectionExpression': 'title'}

    response = docid_table.query(**query_params)
    all_items= response['Items']
    if len(all_items) == 0:
        return None
    else:
        return all_items[0]['title']

  



def search(line):
    terms = termify.termify(line)
    docids = get_docids_for_terms(terms)
    return sort_and_limit([(docid, compute_doc_relevance(docid, terms)) for docid in docids])


##  Implements the formula for relevance.
##   returns 0.0 if the terms list is empty or none of the terms appear in the document   

def compute_doc_relevance(docid, terms):
    total=0.0
    for term in terms:
        total+=get_tfidf(term, docid)

    relevance=total/len(terms)
    return relevance

   
## Input pairs are (docid, tfidf)
##    retrieve the doc title, and truncate tfidf to an integer
##    Output is a list of at most 5 pairs of the form (docname, int-tfidf)
   
def sort_and_limit(pairs):
    sorted_list = sorted(pairs, key=lambda x: x[1], reverse=True)[:5]
    return [(get_doc_title(pair[0]), int(pair[1])) for pair in sorted_list]


