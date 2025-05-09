#!/usr/bin/python3

import sys

#  Current key being processed, and accumulated counts
current_term = None


for line in sys.stdin:
    term, id = line.strip("\n").split('\t')

    if current_term == term:
        doc_count.add(id)

    else:
        # Seeing either a new different key, or the first one
        if current_term:
            print('%s\t%s' % (current_term,len(doc_count)))
        current_term = term
        doc_count = set()
        doc_count.add(id)

if current_term:
    print('%s\t%s' % (current_term,len(doc_count)))


