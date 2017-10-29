package lesson12;

public class UkrainianBankSystem implements BankSystem {

    @Override
    public void withdraw(User user, int amount) {
        if (checkWithdraw(user, amount)) {
            processWithdraw(user, amount);
        }
    }

    @Override
    public void fund(User user, int amount) {
        if (checkFundLimits(user, amount)) {
            processFund(user, amount);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser == null || toUser == null || amount <= 0 || !fromUser.getBank().getCurrency().equals(toUser.getBank().getCurrency())) {
            return;
        }

        if (!checkWithdraw(fromUser, amount)) {
            return;
        }

        if (!checkFundLimits(toUser, amount)) {
            return;
        }

        processWithdraw(fromUser, amount);
        processFund(toUser, amount);
    }

    @Override
    public void paySalary(User user) {
        fund(user, user.getSalary());
    }

    private void printWithdrawalErrorMsg(User user, int amount) {
        System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
    }

    private void printFundErrorMsg(User user, int amount) {
        System.err.println("Can't fund money " + amount + " to user " + user.toString());
    }

    private boolean checkWithdraw(User user, int amount) {
        return  checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal())
            && checkWithdrawLimits(user, amount, user.getBalance());
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + amount*user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(user, amount);
            return false;
        }

        return true;
    }

    private boolean checkFundLimits(User user, int amount) {
        if (amount > user.getBank().getLimitOfFunding()) {
            printFundErrorMsg(user, amount);
            return false;
        }

        return true;
    }

    private void processWithdraw(User user, int amount) {
        user.setBalance(user.getBalance() - amount - amount*user.getBank().getCommission(amount));
    }

    private void processFund(User user, int amount) {
        user.setBalance(user.getBalance() + amount);
    }
}
