package lesson12;

public class Main {
    public static void main(String[] args) {
        Bank euBank = new EUBank(1222, "Sweden", Currency.EUR, 100, 1400, 4, 444343434);
        Bank usBank = new USBank(3455, "USA", Currency.USD, 500, 3200, 5, 124578458);
        Bank chBank = new ChinaBank(7859, "China", Currency.USD, 2000, 800, 3, 1233577885);

        User euUser1 = new User(1001, "Denis", 12200, 40, "GMD", 1500, euBank);
        User euUser2 = new User(1111, "Chris", 22000, 69, "F&F", 2000, euBank);

        User usUser1 = new User(2001, "John", 15040, 100, "GM", 4000, usBank);
        User usUser2 = new User(2111, "Jack", 1040, 3, "HTYE", 1000, usBank);

        User chUser1 = new User(3001, "Lee", 1342, 10, "Abibas", 100, chBank);
        User chUser2 = new User(3111, "Fu Chang", 10020, 133, "Nooi", 900, chBank);

        runBankOperations(usUser1, usUser2);
        runBankOperations(usUser2, usUser1);
        runBankOperations(euUser1, euUser2);
        runBankOperations(euUser2, euUser1);
        runBankOperations(chUser1, chUser2);
        runBankOperations(chUser2, chUser1);
    }

    private static void runBankOperations(User user, User userForTransfer) {
        BankSystem bankSystem = new UkrainianBankSystem();

        System.out.println();
        System.out.println("User " + user.getId() + " operations");

        System.out.println("Current balance: " + user.getBalance());
        System.out.println("Withdrawing 120");
        bankSystem.withdraw(user, 120);
        System.out.println("Balance after withdraw: " + user.getBalance());

        System.out.println("Pay salary: " + user.getSalary());
        bankSystem.paySalary(user);
        System.out.println("Balance after salary paid: " + user.getBalance());

        System.out.println("Fund 200");
        bankSystem.fund(user, 200);
        System.out.println("Balance after fund: " + user.getBalance());

        System.out.println("Transferring 100");
        bankSystem.transferMoney(user, userForTransfer, 100);
        System.out.println("Balance after transferring: " + user.getBalance());
    }
}
