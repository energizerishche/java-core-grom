package lesson15.cast;

public class Demo {
    public static void main(String[] args) {
        InternetProvider provider = (InternetProvider) test();
        System.out.println(provider);

        FoodProvider foodProvider = (FoodProvider) testFood();
    }

    private static Provider test() {
        return new InternetProvider();
    }

    private static Provider testFood() {
        return new InternetProvider();
    }
}
