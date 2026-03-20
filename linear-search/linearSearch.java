import java.util.Random;
import java.util.Arrays;

public class LinearSearch{
    public static int[] linearSearch(int[] array, int sn){
        int checks = 0;
        for (int i = 0; i < array.length; i++){
            checks ++;
            if (array[i] == sn)
                return new int[]{i, checks};
        }
        return new int[] {-1, checks};
    }

    //Test algorithm with random array
    public static void main(String[] args){
        Random random = new Random();
        int[] arr = new int[25];
        for (int j=0; j<25; j++)
            arr[j] = random.nextInt(25) + 1;
        System.out.println("Random array: " + Arrays.toString(arr));
        
        int sn = random.nextInt(25) + 1;
        int[] result = linearSearch(arr, sn);
        int index = result[0];
        int checks = result[1];
        System.out.printf("Search number: %d \nIndex: %d \nLinear search: %d elements checked\n\n", sn, index, checks);
    }
}