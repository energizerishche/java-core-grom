package lesson10.abstractbigexample;

import com.sun.org.apache.xpath.internal.operations.String;

public abstract class Employee {

    private String name;
    private int age;
    private int yearsOfExperience;

    String curPosition;

    private int salaryPerMonth;
    private BankAccount bankAccount;
    private Company[] companiesWorked = new Company[10];
    private String[] positionsWorked = new String[10];

    abstract void paySalary();

    void changePosition(String newPosition) {
        this.saveCurrentPositionToHistory();
        this.curPosition = newPosition;
    }

    private void saveCurrentPositionToHistory() {
        int index = 0;
        for (String pos : positionsWorked) {
            if (pos == null) {
                positionsWorked[index] = this.curPosition;
                break;
            }
            index++;
        }
    }

    int getBalance() {
        return bankAccount.getBalance();
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public String getName() {
        return name;
    }
}
