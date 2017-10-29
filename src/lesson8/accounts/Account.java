package lesson8.accounts;

public class Account {
    String bankName;
    String ownerName;
    int moneyAmount;

    public Account(String bankName, String ownerName, int moneyAmount) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }

    public void depositMoney(int money) {
        this.moneyAmount += money;
    }

    //overloading
    public void depositMoney() {
        moneyAmount += 1000;
        System.out.println("deposit was successful");
    }

    public void changeOwnerName(String newOwnerName) {
        this.ownerName = newOwnerName;
    }
}
