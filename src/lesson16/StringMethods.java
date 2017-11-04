package lesson16;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String test = "someStringExample";

        System.out.println(test.isEmpty());

        System.out.println("".isEmpty());

        System.out.println(test.length());

        System.out.println(test.charAt(2));

        System.out.println(test.replace("me", "T"));

        System.out.println(test.replaceAll("me", "T"));

        System.out.println(test.contains("mes"));

        String phrase = "Hello there guys";
        System.out.println(Arrays.toString(phrase.split("e")));

        System.out.println(" test a".trim());

        System.out.println(phrase.substring(5));
        System.out.println(phrase.substring(5, 8));

        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());
    }
}
