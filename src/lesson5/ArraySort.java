package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
    }
/*    public static void main(String[] args) {
        int[] testArray = {-1, 24, 1478, 8, 2, -10, 13, 7, 8, 100, 0, 1};
        System.out.println(Arrays.toString(sortAscending(testArray)));
        System.out.println(Arrays.toString(sortDescending(testArray)));
    }

    public static int[] sortAscending(int[] array) {
        int index = 0;
        int tempElementPosition;
        int[] result = new int[array.length];
        result[index] = array[index];

        for (index = 1; index < array.length; index++) {
            if (result[index-1] <= array[index]) {
                result[index] = array[index];
            } else {
                tempElementPosition = getAscendingElementPosition(array[index], result);
                shiftElementsRight(result, tempElementPosition, index);
                result[tempElementPosition] = array[index];
            }
        }

        return result;
    }

    public static int[] sortDescending(int[] array) {
        int index = 0;
        int tempElementPosition;
        int[] result = new int[array.length];
        result[index] = array[index];

        for (index = 1; index < array.length; index++) {
            if (result[index-1] >= array[index]) {
                result[index] = array[index];
            } else {
                tempElementPosition = getDescendingElementPosition(array[index], result);
                shiftElementsRight(result, tempElementPosition, index);
                result[tempElementPosition] = array[index];
            }
        }

        return result;
    }

    public static int getAscendingElementPosition(int element, int[] arrayToSearch) {
        int resultIndex = 0;

        for (int sortedArrayElement : arrayToSearch) {
            if (sortedArrayElement > element) {
                break;
            }
            resultIndex++;
        }

        return resultIndex;
    }

    public static int getDescendingElementPosition(int element, int[] arrayToSearch) {
        int resultIndex = 0;

        for (int sortedArrayElement : arrayToSearch) {
            if (sortedArrayElement < element) {
                break;
            }
            resultIndex++;
        }

        return resultIndex;
    }

    public static void shiftElementsRight(int[] arrayToShift, int startShiftPosition, int finishShiftPosition) {
        for (;finishShiftPosition > startShiftPosition; finishShiftPosition--) {
            arrayToShift[finishShiftPosition] = arrayToShift[finishShiftPosition-1];
        }
    }
*/}
