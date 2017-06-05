package Module_2.HW_2_1;

import java.util.Arrays;

/**
 * Created by denis on 30.05.2017.
 */

public class ArrayHolder {

    private int[] array;

    public ArrayHolder(int[] array) {
        this.array = array;
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public int findIndexOfArray(int searchIndex, int value) {
        for (int i = searchIndex; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void sortArrayAZ() {
        Arrays.sort(array);
    }

    public void sortArrayZA() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
