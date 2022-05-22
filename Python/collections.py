# -*- coding: utf-8 -*-
"""
Created on Sun May 22 16:48:17 2022

@author: nusre
"""
#List
l=[1,2,3,4,5,6,6,6,6]
 
#Tuple 
t=(1,2,3,4,5,6) 
l[0]=100
# t[0]=100    # Error because tuple are immutable we cant change.


# Set delete duplicates.
s={1,2,3,4,5,6,6,6,5}   
print(s)        # Output 1,2,3,4,5,6
print(set(l))   # Casting process. List to set

#Dictionary
students={"Nusret":100,"Ahmet":100,"Kim":15}   
print(students["Nusret"]) 
print(students.keys())  #dict_keys(['Nusret', 'Ahmet', 'Kim'])
print(students.values()) #dict_values([100, 100, 15])
print(students.items()) #dict_items([('Nusret', 100), ('Ahmet', 100), ('Kim', 15)])

for k,v in students.items():
    print("Key:",k,"Value:",v)







