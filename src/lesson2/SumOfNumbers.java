package lesson2;

public class SumOfNumbers {
    public static void main(String[] args) {
        long result = 0;
        int a = 0;

        while (a <= 10000000) {
            result += a;
            a++;
        }

        System.out.println(result);
    }
}
