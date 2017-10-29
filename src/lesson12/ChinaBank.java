package lesson12;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        return isUsdCurrency() ? 100 : 150;
    }

    @Override
    public int getLimitOfFunding() {
        return isUsdCurrency() ? 10000 : 5000;
    }

    @Override
    public double getMonthlyRate() {
        return isUsdCurrency() ? 0.01 : 0;
    }

    @Override
    public double getCommission(int amount) {
        if (isUsdCurrency()) {
            return amount <= 1000 ? 0.03 : 0.05;
        } else {
            return amount <= 1000 ? 0.1 : 0.11;
        }
    }
}
