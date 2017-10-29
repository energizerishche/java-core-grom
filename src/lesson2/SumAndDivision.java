package lesson2;

public class SumAndDivision {
    private static final short B = 1234;

    public static void main(String[] args) {
        int sum = 0;
        int a = 0;

        boolean result;

        while (a <= 1000) {
            sum += a;
            a++;
        }

        result = sum/B < sum%B;

        System.out.println(result);
    }
}
