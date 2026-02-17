class BankAccount {
    String owner;
    double balance;

    // Constructor: Sets up the account when created
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // Method: A behavior the account can perform
    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " deposited $" + amount + ". New balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an "Instance" of the BankAccount object
        BankAccount myAccount = new BankAccount("Alex", 500.00);
        
        // Calling methods on that object
        myAccount.deposit(150.00);
        myAccount.deposit(50.0);
    }
}