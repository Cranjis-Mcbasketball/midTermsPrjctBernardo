public class CheckingAccount extends BankAccounts {
    private double minimumBalance;

    public CheckingAccount() {
        super();
        this.minimumBalance = 0.0;
    }

    public CheckingAccount(String accountNo, String accountName, double minimumBalance) {
        super(accountNo, accountName, 0.0, "Active");
        this.minimumBalance = minimumBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void encashCheck(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            setBalance(getBalance() - amount);
            System.out.println("Check encashed successfully. New balance: " + getBalance());
        } else {
            System.out.println("Transaction failed: Insufficient funds to maintain the minimum balance.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nMinimum Balance: " + minimumBalance;
    }
}