package lesson4;

public class SumComparetor {
    public static void main(String[] args) {
        System.out.println(compareSums(1, 8, 3, 5));
    }

    public static int sum(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }

    public static boolean compareSums(int a, int b, int c, int d) {
        return sum(a, b) > sum (c, d);
    }
}
