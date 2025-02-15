// Create an interface Payment with a method void pay(double amount).

// Implement it in two classes:
// CreditCard (prints "Payment of $amount done via Credit Card.")
// UPI (prints "Payment of $amount done via UPI.")

// Write a main method to create objects and call pay().

interface Payment{
    void pay(double amount);
}

class CreditCard implements Payment{
    public void pay(double amount){
        System.out.println("Payment of $ " + amount + " done via credit card.");
    }
}

class UPI implements Payment{
    public void pay(double amount){
        System.out.println("Payment of $ " + amount + " done via UPI.");
    }
}

public class PaymentSystemInterface {
    public static void main(String[] args) {
        CreditCard c1 = new CreditCard();
        UPI u1 = new UPI();

        c1.pay(5000);
        u1.pay(10000);
    }
}
