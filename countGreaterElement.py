# Given an array of positive integers, return the number of elements that are strictly greater than the average of all previous elements. Skip the first element.

# Example

# Input

# responseTimes = [100, 200, 150,300]
# Output

# 2
# Explanation

# - Day 0: 100 (no previous days, skip) 
# - Day 1: 200 > average(100) = 100 → count = 1 
# - Day 2: 150 vs average(100, 200) = 150 → not greater → count = 1 
# - Day 3: 300 > average(100, 200, 150) = 150 → count = 2 Return 2.

def countResponseTimeRegressions(responseTimes):
    # Write your code here
    if len(responseTimes) <= 1: 
        return 0
    
    amount_strictly_greater = 0
    curr_sum = responseTimes[0]
    curr_avg = 0
    
    for i in range(1, len(responseTimes)):
        curr_avg = curr_sum / i
        
        if(responseTimes[i] > curr_avg): 
            amount_strictly_greater += 1
        
        curr_sum += responseTimes[i]
        
    return amount_strictly_greater

if __name__ == '__main__':
    responseTimes_count = int(input().strip())

    responseTimes = []

    for _ in range(responseTimes_count):
        responseTimes_item = int(input().strip())
        responseTimes.append(responseTimes_item)

    result = countResponseTimeRegressions(responseTimes)

    print(result)

