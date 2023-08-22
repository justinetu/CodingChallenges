'''
Given a string, write a function to compress it by shortening every
sequence of the same character to that character followed by the number
of repetitions. If the compressed string is longer than the original, 
you should return the original string.

e.g.

compress("a") = a
compress("aaa") = a3
compress("aaabbb") = a3b3
compress("aaabccc") = a3b1c3
'''

def compress(letters: str) -> str:
    comp_str = ''
    lett_dict = {}
    if len(letters) == 1: return letters
    for letter in letters:
        if letter not in lett_dict.keys():
            lett_dict[letter] = 1
        else:
            lett_dict[letter] += 1
    for key in lett_dict.keys():
        comp_str += key + str(lett_dict[key])
    if len(comp_str) > len(letters): return letters
    return comp_str
