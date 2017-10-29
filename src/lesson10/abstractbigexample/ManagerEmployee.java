package lesson10.abstractbigexample;

public class ManagerEmployee extends Employee {

    @Override
    void paySalary() {
        int newBalance = this.getBankAccount().getBalance() + getSalaryPerMonth();
        newBalance += newBalance*0.25;
        this.getBankAccount().setBalance(newBalance);
    }
}
