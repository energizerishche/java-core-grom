package lesson2;

public class OperatorExample {
    public static void main(String[] args) {
        int a = 100;
        int b = 30;

        int c1 = a / b;
        int c2 = a % b;

        System.out.println(c1);
        System.out.println(c2);

        a = a + 1;
        System.out.println(a);
        a++;
        System.out.println(a);

        int n = 10;

        a = a + n;
        System.out.println(a);
        a += n;
        System.out.println(a);
        a -= n;
        System.out.println(a);

        a -= 1011;
        System.out.println(a);
    }
}
