package lesson4;

public class DivCounter {

    public static void main(String[] args) {
        short a = 1;
        short b = 40;
        System.out.println(findDivCount(a, b, 5));
    }

    public static short findDivCount(short a, short b, int n) {
        short result = 0;

        for (short i = a; i <= b; i++) {
            if (i % n == 0) {
                result++;
            }
        }

        return result;
    }
}
