# Given a string containing letters, digits, and symbols, determine if it reads the same forwards and backwards when considering only alphabetic characters (case-insensitive).

# Example

# Input

# code = A1b2B!a
# Output

# 1
# Explanation

# - Step 1: Extract only letters → ['A','b','B','a'] 
# - Step 2: Convert to lowercase → ['a','b','b','a'] 
# - Step 3: Compare sequence forward and backward: 'abba' == 'abba' → true

def isAlphabeticPalindrome(code):
    # Write your code here
    code_array = []
    
    if len(code) <= 1:
        return 1
        
    for char in code:
        if char.isalpha():
            code_array.append(char.lower())

    left = 0
    right = len(code_array) - 1
    
    while left <= right:
        if code_array[left] == code_array[right]:
            left += 1
            right -= 1
        else:
            return 0
    
    return 1        
    
    # Broken Solution Below - Attempting to achieve O(1) Space Complexity
    # left = 0
    # right = len(code) - 1
    
    # while left <= right or code[left].isalpha() and code[right].isalpha():
    #     if code[left].lower() == code[right].lower():
    #         left += 1
    #         right -= 1
    #     else:
    #         return 0
            
            

if __name__ == '__main__':
    code = input()

    result = isAlphabeticPalindrome(code)

    print(int(result))
