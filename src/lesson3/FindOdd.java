package lesson3;

public class FindOdd {
    public static void main(String[] args) {
        short a = 0;
        int sum = 0;

        while (a <= 1000) {
            if (a % 2 != 0) {
                System.out.println("Found");
                sum += a;
            }
            a++;
        }

        System.out.println((sum*5) > 5000 ? "Bigger" : "Smaller or equal");
    }
}
