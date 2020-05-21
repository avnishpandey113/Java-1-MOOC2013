
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        // write the code here
        int small = array[0];
        for (int i = 0; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
            }
        }
        return small;
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        int indexOfTheSmallest = -1;
        int small = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == small) {
                indexOfTheSmallest = i;
            }
        }
        return indexOfTheSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int small = array[index];
        for (int i = index; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
            }
        }
        int indexOfTheSmallest = -1;
        for (int i = index; i < array.length; i++) {
            if (array[i] == small) {
                indexOfTheSmallest = i;
            }
        }
        return indexOfTheSmallest;

    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int index = 0;
        while (index < array.length) {
            System.out.println(Arrays.toString(array));
            int small = array[index];
            for (int i = index; i < array.length; i++) {
                if (small > array[i]) {
                    small = array[i];
                }
            }
            int indexOfTheSmallest = -1;
            for (int i = index; i < array.length; i++) {
                if (array[i] == small) {
                    indexOfTheSmallest = i;
                }
            }
            int temp = array[index];
            array[index] = array[indexOfTheSmallest];
            array[indexOfTheSmallest] = temp;

            index++;

        }
    }

}
