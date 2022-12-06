# Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
# 35231 => [1,3,2,5,3]

def digitize(n):
    to_string = str(n)
    list = []
    for ch in to_string:
        list.append(int(ch))
    list.reverse()
    return list
