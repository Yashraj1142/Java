// Write a Java program that creates a thread which prints a message 5 times at an interval of 1 second. Use sleep() to pause the thread and print the thread’s state (e.g., Thread.State) before and after starting, and after termination.

class Ques4Exmp extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            } catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Ques4Exmp q = new Ques4Exmp();

        System.out.println("Thread state before starting: " + q.getState());

        q.start();

        System.out.println("Thread state after starting: " + q.getState());
        
        try{
            q.join();   //waits for the thread to die
        } catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Thread state after termination: " + q.getState());
    }
}