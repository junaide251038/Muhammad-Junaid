class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    // Static variable
    static String bankName = "Sonali Bank";

    // Constructor to initialize account details
    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to display account information
    void showAccountInfo() {
        System.out.println("Bank Name        : " + bankName);
        System.out.println("Account Number   : " + accountNumber);
        System.out.println("Account Holder   : " + accountHolderName);
        System.out.println("Balance          : " + balance);
        System.out.println("----------------------------");
    }

    // Static method to display bank name
    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating two bank accounts
        BankAccount acc1 = new BankAccount("1001", "Junaid", 5000);
        BankAccount acc2 = new BankAccount("1002", "Rafi", 8000);

        // Display account information
        System.out.println("== Account 1 Information ==");
        acc1.showAccountInfo();

        System.out.println("== Account 2 Information ==");
        acc2.showAccountInfo();

        // Show bank name using static method
        System.out.println("== Bank Information ==");
        BankAccount.showBankName();
    }
}
