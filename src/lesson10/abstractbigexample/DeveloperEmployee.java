package lesson10.abstractbigexample;

public class DeveloperEmployee extends Employee {
    private String[] frameworks = new String[10];

    @Override
    void paySalary() {
        int newBalance = this.getBankAccount().getBalance() + this.getSalaryPerMonth() + 1000;
        this.getBankAccount().setBalance(newBalance);
    }
}
