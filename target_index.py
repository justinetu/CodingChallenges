# Given a sorted array of distinct integers and a target value, return the index of the target or -1 if not found.

# Example 1

# Input:

# nums = [1, 2, 3, 4, 5]
# target = 3
# Output:

# 2
# Explanation:

# Initialize low = 0, high = 4. Compute mid = (0 + 4) // 2 = 2. nums[2] = 3 matches target, so return 2.

def binarySearch(nums, target):
    # Write your code here
    low = 0
    high = len(nums) - 1
    
    while low <= high:
        mid = (low + high) // 2
        if nums[mid] == target:
            return mid
        elif target < nums[mid]:
            high = mid - 1
        else:
            low = mid + 1
    
    return -1

if __name__ == '__main__':
    nums_count = int(input().strip())

    nums = []

    for _ in range(nums_count):
        nums_item = int(input().strip())
        nums.append(nums_item)
