import random

def binarySearch(array, sn):
    checks, left, right = 0, 0, len(array) - 1
    while left <= right:
        checks += 1
        i = left + (right - left) // 2
        if array[i] < sn:
            left = i+1
        elif array[i] > sn:
            right = i-1
        else:
            return i, checks
    return -1, checks

#Test algorithm with random array
arr = [n + 1 for n in range(25)]
print(f'Random array: {arr}')
sn = random.randint(1, 26)
index, checks = binarySearch(arr, sn)
print(f"Search number: {sn} \nIndex: {index} \nBinary search: {checks} elements checked\n")