import java.util.Arrays;
import java.util.Random;

public class BubbleSort{
    public static int bubbleSort(int[] array){
        int steps = 0, temp;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    steps++;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return steps;
    }
    public static void main(String[] args){
        Random random = new Random();
        int[] arr = new int[25];
        for (int j=0; j<25; j++)
            arr[j] = random.nextInt(25) + 1;
        System.out.println("Random array: " + Arrays.toString(arr));
        int swaps = bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.printf("Bubble sort: %d swaps\n\n", swaps);
    }
}