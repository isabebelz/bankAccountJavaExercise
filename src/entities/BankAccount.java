package entities;

public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double initialDeposit;

    public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.initialDeposit = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder() {
        this.accountHolder = accountHolder;
    }

    public void addDeposit(double deposit) {
        initialDeposit += deposit;
    }

    public void withDraw(double withDraw) {
        initialDeposit -= withDraw + 5;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + accountHolder
                + ", Balance: $ "
                + String.format("%.2f", initialDeposit);
    }

}
