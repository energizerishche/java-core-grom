package lesson5;

public class UniqueCount {
    public static void main(String[] args) {
        int[] testArray = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11};
        System.out.println(uniqueCount(testArray));
    }

    public static int uniqueCount(int[] array) {
        int result = checkZeroValuePresent(array) ? 1 : 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                result++;

                for (int j = i+1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        array[j] = 0;
                    }
                }
            }
        }

        return result;
    }

    public static boolean checkZeroValuePresent(int[] array) {
        for (int el : array) {
            if (el == 0) {
                return true;
            }
        }

        return false;
    }
}
