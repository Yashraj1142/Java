// Write a Java program to create a thread by implementing the Runnable interface. Display a message "Running in thread" five times.

class Ques2Exmp implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Running in thread.");
        }
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Ques2Exmp q = new Ques2Exmp();

        Thread t = new Thread(q);

        t.start();
    }
}
