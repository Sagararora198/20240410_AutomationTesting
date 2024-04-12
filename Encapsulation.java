package Aspire;


class BankAccount {
    private double balance;

    public void deposit(double amount) {
        // Perform deposit operation
        balance += amount;
    }

    public void withdraw(double amount) {
        // Perform withdrawal operation
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        // Return current balance
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
    	BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Current balance: " + account.getBalance());
    }
}
