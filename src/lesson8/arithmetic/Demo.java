package lesson8.arithmetic;

public class Demo {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int[] testArray = {100, 12, 1, -1, 0};

        adder.check(new int[]{100, 12, 1, 0});
        adder.add(234, 456);
    }
}
