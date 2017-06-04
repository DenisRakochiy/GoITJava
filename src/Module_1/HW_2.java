package Module_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by denis on 26.04.2017.
 */

public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
            for (int i=0; i<arr.length; i++){
                System.out.println("Enter number "+(i+1));
                arr[i] = sc.nextInt();
            }
            System.out.println("Entered array " + Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println("Sorted array " + Arrays.toString(arr));
    }
}

