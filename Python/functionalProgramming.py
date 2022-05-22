# -*- coding: utf-8 -*-
"""
Created on Sat May 21 17:25:17 2022

@author: nusre
"""

l= []
for x in range(11):
    l.append(x**2)      
print(x)    # Python keeps x value. But I dont want.
# Functional Programming
#lambda = def square(x):return x**2  =  lambda x:x**2 but we can use just one time
# map(function,range)

square=list(map(lambda y: y**2,range(11)))  
#  print(y)    # Name y is not defined 

squares=[i**2 for i in range(11)]


l1=[(x,y) for x in [1,2,3] for y in [2,3,4] if x!=y]

# We get (1,2),(1,3),(1,4),(2,3),(2,4),(3,2),(3,4)
