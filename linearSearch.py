import random
import time

def linearSearch(arr, sn):
    s = 0
    for i in range(len(arr)):
        s += 1
        if arr[i] == sn:
            return i, s
    return -1, s

arr = [random.randint(1, 25) for n in range(25)]
print(arr)
sn = random.randint(1, 25)
index , lChecks = linearSearch(arr, sn)
print(f"Search number: {sn} \nIndex: {index} \nLinear search: {lChecks} elements checked\n")