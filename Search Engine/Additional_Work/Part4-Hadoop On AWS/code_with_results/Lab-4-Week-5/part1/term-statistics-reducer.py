#!/usr/bin/python3

import sys

#  Current key being processed, and accumulated counts
current_docid = None
num_stopword=0
unique=[]
for line in sys.stdin:
    docid, term,stopword = line.strip("\n").split('\t')

    if current_docid == docid:
        total_words_prior += 1
        if stopword=="1":
         num_stopword+=1
        if term!='':
         total_words_after +=1
         unique.append(term)
    else:
        # Seeing either a new different key, or the first one
        if current_docid:
            print('%s\t%s\t%s\t%s\t%s' % (current_docid,
                                      total_words_prior,
                                      num_stopword,
                                      total_words_after,len(set(unique))))
        current_docid = docid
        total_words_prior = 1
        if stopword=="1":
         num_stopword=1
        else:
         num_stopword=0
        if term!='':
         total_words_after =1
         unique=[]
         unique.append(term)
        else:
         total_words_after =0
         unique=[]

            
if total_words_prior > 0:
    print('%s\t%s\t%s\t%s\t%s' % (current_docid,
                                      total_words_prior,
                                      num_stopword,
                                      total_words_after,len(set(unique))))

