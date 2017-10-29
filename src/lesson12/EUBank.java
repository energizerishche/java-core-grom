package lesson12;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        return isUsdCurrency() ? 2000 : 2200;
    }

    @Override
    public int getLimitOfFunding() {
        return isUsdCurrency() ? 10000 : 20000;
    }

    @Override
    public double getMonthlyRate() {
        return isUsdCurrency()? 0 : 0.01;
    }

    @Override
    public double getCommission(int amount) {
        if (isUsdCurrency()) {
            return amount <= 1000 ? 0.05 : 0.07;
        } else {
            return amount <= 1000 ? 0.02 : 0.04;
        }
    }
}
