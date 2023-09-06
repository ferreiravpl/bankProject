package entities;

public class Account {

    Transaction tc = new Transaction();

    public String name;
    private int accountNumber;

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
                ", initialDeposit=" + tc.getInitialDeposit() +
                ", balance=" + Transaction.getBalance() +
                '}';
    }
}
