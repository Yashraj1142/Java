// A bank has a shared account with an initial balance of $1000. Two threads represent two bank tellers attempting to withdraw money simultaneously.
// Teller 1 tries to withdraw $600.
// Teller 2 tries to withdraw $700.

class BankAccount extends Thread{
    int Balance;

    BankAccount(int Balance){
        this.Balance = Balance;
    }

    synchronized public void withdraw(int withdrawAmount, String tellerName){
        System.out.println("Withdrawl attempt of amount " + withdrawAmount + " by " + tellerName);
        if(withdrawAmount>Balance){
            System.out.println("Balance low.");
        } else{
            System.out.println("Withdraw processed");
            Balance = Balance - withdrawAmount;
            System.out.println("Remaining Balance: " + Balance);
            System.out.println("---------------------------");
        }
    }
}

class Teller extends Thread{
    BankAccount account;
    int withdrawAmount;
    String tellerName;

    Teller(BankAccount account, int withdrawAmount, String tellerName){
        this.account = account;
        this.withdrawAmount = withdrawAmount;
        this.tellerName = tellerName;
    }

    public void run(){
        account.withdraw(withdrawAmount, tellerName);
    }
}

public class Ques5 {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(1000);

        Teller t1 = new Teller(sharedAccount, 600, "ABC");
        Teller t2 = new Teller(sharedAccount, 700, "XYZ");

        t1.start();
        t2.start();
    }
}
