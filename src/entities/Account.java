package entities;

public class Account {

    public String name;
    private int accountNumber;
    public double initialDeposit;
    protected static double balance;

    public Account (String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public Account () {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        Account.balance = getBalance();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", initialDeposit=" + initialDeposit +
                ", balance=" + balance +
                '}';
    }
}
