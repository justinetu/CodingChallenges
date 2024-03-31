'''Let's say a triple (a, b, c) is a zigzag if either a < b > c or a > b < c.

Given an array of integers numbers, your task is to check all the triples of its consecutive elements for being a zigzag. More formally, your task is to construct an array of length numbers.length - 2, where the ith element of the output array equals 1 if the triple (numbers[i], numbers[i + 1], numbers[i + 2]) is a zigzag, and 0 otherwise.

Example

For numbers = [1, 2, 1, 3, 4], the output should be solution(numbers) = [1, 1, 0].

(numbers[0], numbers[1], numbers[2]) = (1, 2, 1) is a zigzag, because 1 < 2 > 1;
(numbers[1], numbers[2] , numbers[3]) = (2, 1, 3) is a zigzag, because 2 > 1 < 3;
(numbers[2], numbers[3] , numbers[4]) = (1, 3, 4) is not a zigzag, because 1 < 3 < 4;
For numbers = [1, 2, 3, 4], the output should be solution(numbers) = [0, 0];

Since all the elements of numbers are increasing, there are no zigzags.

For numbers = [1000000000, 1000000000, 1000000000], the output should be solution(numbers) = [0].

Since all the elements of numbers are the same, there are no zigzags.'''

# Solution

def solution(numbers):
    if len(numbers) == 3:
        if (numbers[0] < numbers[1] and numbers[1] > numbers[2]) or (numbers[0] > numbers[1] and numbers[1] < numbers[2]):
            return [1]

        else:
            return [0]

    else:
        ptr1 = 0
        ptr2 = ptr1 + 1
        ptr3 = ptr2 + 1
        result = []

        while(ptr3 != len(numbers)):
            if (numbers[ptr1] < numbers[ptr2] and numbers[ptr2] > numbers[ptr3]) or (numbers[ptr1] > numbers[ptr2] and numbers[ptr2] < numbers[ptr3]):
                result.append(1)
            else:
                result.append(0)

            ptr1 = ptr1 + 1
            ptr2 = ptr2 + 1
            ptr3 = ptr3 + 1

        return result
