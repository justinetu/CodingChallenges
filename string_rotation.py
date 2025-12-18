# Given two strings s1 and s2, return 1 if s2 is a rotation of s1 but not identical to s1, otherwise return 0.

# Example

# Input:

# s1 = abcde
# s2 = cdeab
# Output:

# True
# Explanation:

# - s2 ('cdeab') is a non-trivial rotation of s1 ('abcde'). 
# - If you rotate 'abcde' left by 2 positions, you get 'cdeab'. 
# - Since s2 is not equal to s1 and is a rotation, the output is true.

def isNonTrivialRotation(s1, s2):
    # Write your code here
    s1_doubled = s1 + s1
    if len(s1) == len(s2) and s2 in s1_doubled:
        if s1 == s2:
            return False
        return True
    
    return False

if __name__ == '__main__':
    s1 = input()

    s2 = input()

    result = isNonTrivialRotation(s1, s2)

    print(int(result))
