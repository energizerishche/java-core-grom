package lesson9.userRepository;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int size = 24;
        User[] testArray = {
                null,
                new User(1, "John1", "ddsad1"),
                new User(2, "", "ddsad2"),
                new User(3, null, "ddsad3"),
                new User(4, "John2", null),
                new User(5, null, null),
                new User(10, "John3", "ddsad4"),
                null,
                new User(Long.MAX_VALUE, "John4", "ddsad4"),
                new User(Long.MIN_VALUE, null, "ddsad4"),
        };
        User[] testArray3 = {null, null, null};

        User[] testArray2 = new User[size];
        long[] indexes = new long[size];

        int i = 0;
        int j;

        for (; i < size; i += testArray.length) {
            j = 0;
            for (User test : testArray) {
                if ((i+j) < size) {
                    testArray2[i+j] = test;
                    indexes[i+j] = test == null ? 0 : test.getId();
                    j++;
                }
            }
        }

        UserRepository repo = new UserRepository(testArray3);

        System.out.println(Arrays.toString(testArray2));
        System.out.println(Arrays.toString(repo.getUserIds()));
    }
}
