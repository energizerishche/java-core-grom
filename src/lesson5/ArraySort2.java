package lesson5;

import java.util.Arrays;

public class ArraySort2 {
    public static void main(String[] args) {
        int[] testArray = {-1, 24, 1478, 8, 2, -10, 13, 7, 8, 100, 0, 1};
        System.out.println(Arrays.toString(sortAscending(testArray)));
        System.out.println(Arrays.toString(sortDescending(testArray)));
    }

    public static int[] sortAscending(int[] array) {
        for (int index = 1, temp; index < array.length; index++) {
            if (array[index-1] > array[index]) {
                temp = array[index];
                array[index] = array[index-1];
                array[index-1] = temp;
                sortAscending(array);
            }
        }

        return array;
    }

    public static int[] sortDescending(int[] array) {
        for (int index = array.length-1, temp; index > 0; index--) {
            if (array[index-1] < array[index]) {
                temp = array[index];
                array[index] = array[index-1];
                array[index-1] = temp;
                sortDescending(array);
            }
        }

        return array;
    }
}
