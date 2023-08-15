import math

#array = [15, 12, 2, 4, 6, 10, 8]

array = [8, 56, 7, 6, 9, 10, 22, 33, 5]

look_up = 22

def binary_search(my_list, num):

    if len(my_list) == 1:
        return my_list
    my_list.sort()
    start = 0
    end = len(my_list) - 1
    mid = start + end / 2
    while num != my_list[math.floor(mid)]:
        if num > my_list[math.floor(mid)]:
            start = math.floor(mid) + 1
            mid = ((math.floor(mid) + 1) + (end)) / 2
            if mid == end and num != my_list[math.floor(mid)]:
                return f'Value: {num} not found'
        else:
            end = math.floor(mid) - 1
            mid = ((mid - 1) + (start)) / 2
            math.floor(mid)
            if mid == start and num != my_list[math.floor(mid)]:
                return f'Value: {num} not found'
    return f'A match was found! {num} == {my_list[math.floor(mid)]}'

print(binary_search(array, look_up))
