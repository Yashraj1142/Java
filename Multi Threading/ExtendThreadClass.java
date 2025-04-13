//Extending the thread class
class Example extends Thread{
    //overriding the run method
    public void run(){
        System.out.println("Thread is running...");
    }
}

public class ExtendThreadClass{
    public static void main(String[] args) {
        //creating object of the class
        Example t1 = new Example();

        //calling the start() method
        t1.start();
    }
}