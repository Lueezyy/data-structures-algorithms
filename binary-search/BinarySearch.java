import java.util.Random;
import java.util.Arrays;

public class BinarySearch {
    public static int[] binarySearch(int[] array, int sn){
        int checks = 0;
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            checks++;
            int i = left + (right - left)/2;
            if (array[i] < sn)
                left = i + 1;
            else if (array[i] > sn)
                right = i - 1;
            else
                return new int[] {i, checks};
        }
        return new int[] {-1, checks};
    }
    public static void main(String[] args){
        Random random = new Random();
        int[] arr = new int[25];
        for (int j=0; j<25; j++)
            arr[j] = j + 1;
        System.out.println(Arrays.toString(arr));
        
        int sn = random.nextInt(26) + 1;
        int[] result = binarySearch(arr, sn);
        int index = result[0];
        int checks = result[1];
        System.out.printf("Search number: %d \nIndex: %d \nBinary search: %d elements checked\n\n", sn, index, checks);
    }
}