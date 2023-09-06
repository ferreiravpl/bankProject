package entities;

public class Transaction {

    public static double deposit;
    public static double withdraw;
    public double initialDeposit;
    private double balance;

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw + 5;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }
    public double getInitialDeposit() {
        return initialDeposit;
    }

    public double getBalance() {
        return balance + getInitialDeposit() + deposit - withdraw;
    }

    public void setBalance(double balance) {
        if (initialDeposit != 0) {
            this.balance = initialDeposit + balance;
        } else {
            this.balance = balance;
        }
    }
}
