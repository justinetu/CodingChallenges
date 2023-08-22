'''
Given two strings, write a function to determine whether they are anagrams

EX1. rescue, secure --> True

EX2. care, race     --> True

EX3. trap, part     --> True

EX4. keen, kill     --> False
'''

def isAnagram(string1: str, string2: str) -> bool:
    return sorted(string1.lower()) == sorted(string2.lower())
