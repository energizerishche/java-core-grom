package lesson5;

public class Withdraw {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nilolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};

        System.out.println(withdraw(names, balances, "Ann", 500));
    }

    public static int withdraw(String[] clients, int[] balances, String client, int amount) {
        int currentUserBalance = findUserBalance(clients, balances, client);
        int userIndex = findUserIndex(clients, client);
        int newAmount;

        if  (currentUserBalance >= amount) {
            newAmount = currentUserBalance - amount;
            balances[userIndex] = newAmount;

            return newAmount;
        } else {
            return -1;
        }
    }

    public static int findUserBalance(String[] clients, int[] balances, String client) {
        return balances[findUserIndex(clients, client)];
    }

    public static int findUserIndex(String[] clients, String client) {
        int index = 0;

        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            index++;
        }

        return index;
    }
}
