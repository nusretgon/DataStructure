# -*- coding: utf-8 -*-
"""
Created on Sat May 21 16:41:53 2022

@author: nusre
"""

# LISTS
l1=[1,2,3,4,5,6,7,8,9]
l1.append(10)
print(l1)
l1.insert(1,123)
l1.append(123)
print(l1)
l1.remove(123) # first 123 deleted.
print(l1)
l1.pop()       # last element removed and taken
l1.insert(1,123)
print(l1)
l1.sort()
print(l1)

l2=[1,2,3]
l1.append(l2)
print(l1)
l1.extend(l2)
print(l1)

l1=l2          # They have same adreess
print(l1)
print(l2)   
l2.append(10)   
print(l1)
print(l2)       #Changes effects two list.

l3=l2.copy()
l2.append(12)
print(l2)
print(l3)    # didn't effect

# There are a lot of function 
# you can learn from python documentation

