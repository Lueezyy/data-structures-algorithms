import random

def bubbleSort(array):
    steps = 0
    for i in range(len(array)):
        for j in range(len(array) - i - 1):
            if array[j] > array[j+1]:
                steps += 1
                array[j], array[j+1] = array[j+1], array[j]
    return steps

arr = [random.randint(1, 25) for n in range(25)]
print(f'Random array: {arr}')
swaps = bubbleSort(arr)
print(f'Sorted array: {arr}')
print(f"Bubble sort: {swaps} swaps\n\n")