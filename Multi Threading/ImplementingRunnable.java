//Implementing Runnable interface
class ExampleRunnable implements Runnable{
    //Overriding the run method
    public void run(){
        System.out.println("Thread is running...");
    }
}

public class ImplementingRunnable {
    public static void main(String[] args) {
        //Creating the object of class
        ExampleRunnable obj = new ExampleRunnable();

        //Passing the object to thread constructor
        Thread t1 = new Thread(obj);

        //Calling the start method
        t1.start();
    }
}
