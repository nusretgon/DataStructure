# -*- coding: utf-8 -*-
"""
Created on Sat May 21 17:06:10 2022

@author: nusre
"""
from collections import deque

# Stacks using lists   LIFO
# Functions push=append  pop=pop 

l=[1,2,3,4,5,6,7,8,9]
print(l.pop())  # gives us 9 because last element is 9
l.append(10)    # append to the end
print(l)        # 1,2,3,4,5,6,7,8,10 


# Queue     FIFO

l1=deque([10,11,12])
l1.append(13)   
print(l1.popleft()) # or u can use pop(0)
print(l1)


"""
print(l.pop())  #Sondan sildik  (stack)

print(l.pop(0)) # Baştan sildik (queue)
"""