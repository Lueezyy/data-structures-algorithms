import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class linearSearch{
    public static int[] linear_search(int[] array, int sn){
        int checks = 0;
        for (int i = 0; i < array.length; i++){
            checks ++;
            if (array[i] == sn)
                return new int[]{i, checks};
        }
        return new int[] {-1, checks};
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Repeat test how many times: ");
        int rep = input.nextInt();
        input.close();

        for (int i=0; i<rep; i++){
            int[] arr = new int[50];
            for (int j=0; j<50; j++)
                arr[j] = random.nextInt(50) + 1;

            System.out.println(Arrays.toString(arr));

            int sn = random.nextInt(50) + 1;
            int[] result = linear_search(arr, sn);
            int index = result[0];
            int checks = result[1];

            System.out.printf("Search number: %d | Linear search: %d elements checked\n", sn, checks);
            System.out.println();
        }
    }
}