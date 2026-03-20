import random

def linearSearch(arr, sn):
    checks = 0
    for i in range(len(arr)):
        checks += 1
        if arr[i] == sn:
            return i, checks
    return -1, checks

#Test algorithm with random array
arr = [random.randint(1, 25) for n in range(25)]
print(arr)
sn = random.randint(1, 25)
index, checks = linearSearch(arr, sn)
print(f"Search number: {sn} \nIndex: {index} \nLinear search: {checks} elements checked\n")