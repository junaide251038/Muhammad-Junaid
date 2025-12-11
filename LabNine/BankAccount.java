class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Setter Methods
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to show information securely
    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class Main2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setAccountHolder("Junaid");
        acc.setAccountNumber("9876543210");
        acc.setBalance(15000.50);

        System.out.println("Bank Account Information:");
        acc.showAccountInfo();
}
}
