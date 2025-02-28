// File Name: BankAccountDemo.java

// Define the BankAccount class
class BankAccount {
    // Attributes with different access modifiers
    public String accountHolder; // Public access
    private double balance;       // Private access
    protected String accountType; // Protected access

    // Constructor to initialize the attributes
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Main class to run the program
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");
        
        // Modify the account balance
        myAccount.deposit(250.0);
        myAccount.withdraw(100.0);
        
        // Print account details
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
