#include <iostream>
#include <random>
#include <vector>

using namespace std;

int* linear_search(int array[], int size, int sn){
    int checks = 0;
    static int result[2];

    for (int i = 0; i < size; i++){
        checks++;
        if (array[i] == sn){
            result[0] = i;
            result[1] = checks;
            return result;
        }
    }
    result[0] = -1;
    result[1] = checks;
    return result;
}

//Test algorithm with random array
int main() {
    random_device rd;
    mt19937 gen(rd());
    uniform_int_distribution<> distrib(1, 25);
    int arr[25];
    for (int j = 0; j < 25; j++){
        arr[j] = distrib(gen);
    }
    cout << "[";
    for (int j = 0; j < 25; j++){
        cout << arr[j];
        if (j < 24) cout << ", ";
    }
    cout << "]" << endl;
    int sn = distrib(gen);
    int* result = linear_search(arr, 25, sn);
    int index = result[0];
    int checks = result[1];
    cout << "Search number: " << sn << endl;
    cout << "Index: " << index << endl;
    cout << "Linear search: " << checks << " elements checked" << endl << endl;
    return 0;
}