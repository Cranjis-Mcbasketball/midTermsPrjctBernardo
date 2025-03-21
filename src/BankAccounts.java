public class BankAccounts {
    private int accountNo;
    private String accountName;
    private double balance;
    private boolean status; // active or closed

    public BankAccounts() {
        this.accountNo = 0;
        this.accountName = null;
        this.balance = 0;
        this.status = true;
    }

    public BankAccounts(int accountNo, String accountName) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = 0;
        this.status = true;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean getStatus() {
        return status;
    }

    public boolean setStatus(boolean status) {
        this.status = status;
        return status;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public double inquireBalance() {
        return balance;
    }

    public void transferMoney(BankAccounts target, double amount) {
        if (balance >= amount && status) {
            balance -= amount;
            target.deposit(amount);
        }
    }

    public void closeAccount() {
        status = false;
        balance = 0;
    }

    @Override
    public String toString() {
        return "Account Information" + "\n" +
                "Account No: " + accountNo + "\n" +
                "Name: " + accountName + "\n" +
                "Balance: " + balance + "\n" +
                "Status: " + status;
    }
}
