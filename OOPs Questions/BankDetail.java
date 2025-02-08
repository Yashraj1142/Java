class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Protected method to withdraw funds
    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class BankDetail {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        System.out.println("Initial balance:");
        account.checkBalance();

        account.deposit(500.0);
        account.checkBalance();

        account.withdraw(300.0); 
        account.checkBalance();
    }
}
