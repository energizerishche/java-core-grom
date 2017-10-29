package lesson12;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        return isUsdCurrency() ? 1000 : 1200;
    }

    @Override
    public int getLimitOfFunding() {
        return isUsdCurrency() ? Integer.MAX_VALUE : 10000;
    }

    @Override
    public double getMonthlyRate() {
        return isUsdCurrency() ? 0.01 : 0.02;
    }

    @Override
    public double getCommission(int amount) {
        if (isUsdCurrency()) {
            return amount <= 1000 ? 0.05 : 0.07;
        } else {
            return amount <= 1000 ? 0.06 : 0.08;
        }
    }
}
