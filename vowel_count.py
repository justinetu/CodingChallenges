"""
  Return the number (count) of vowels in the given string.

  We will consider a, e, i, o, u as vowels for this Kata (but not y).

  The input string will only consist of lower case letters and/or spaces.

"""

def get_count(sentence):
    vowels = ['a','e','i','o','u']
    num_of_vowels = 0
    for character in sentence:  
        if character in vowels: num_of_vowels = num_of_vowels + 1
    return num_of_vowels
