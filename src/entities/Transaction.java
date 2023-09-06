package entities;

public class Transaction {

    private double deposit;
    private double withdraw;
    public double initialDeposit;
    protected static double balance;


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
        setBalance(getBalance() - withdraw - 5);
    }

    public double getInitialDeposit() {
        return this.initialDeposit;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public static double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = getInitialDeposit() + getBalance() - getWithdraw();
    }
}
