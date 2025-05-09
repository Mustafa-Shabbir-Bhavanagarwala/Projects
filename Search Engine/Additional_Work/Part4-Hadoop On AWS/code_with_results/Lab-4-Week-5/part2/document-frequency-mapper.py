#!/usr/bin/python3

import sys
import os
import re

    
for line in sys.stdin:
   id,term,count = line.strip().split()
   print('%s\t%s' % (term,id))
