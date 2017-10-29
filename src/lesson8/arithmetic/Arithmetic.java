package lesson8.arithmetic;

public class Arithmetic {

    public boolean check(int[] array) {
        return getMin(array) + getMax(array) > 100;
    }

    protected int getMin(int[] array) {
        int result = 0;

        for (int element : array) {
            if (element < result) {
                result = element;
            }
        }

        return result;
    }

    protected int getMax(int[] array) {
        int result = 0;

        for (int element : array) {
            if (element > result) {
                result = element;
            }
        }

        return result;
    }
}
