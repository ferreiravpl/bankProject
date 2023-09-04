package entities;

import static entities.Account.balance;

public class Transaction {

    private double deposit;
    private double withdraw;

    public double getDeposit() {
        return deposit + balance;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        Account.setBalance(Account.getBalance() - withdraw - 5);
    }
}
