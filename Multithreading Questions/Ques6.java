// Thread Communication using wait() and notify() (Revised):
// Implement a system where two threads simulate a printing service.
// Printer Thread: Waits for a print job to be added to a shared print queue and then processes it.
// User Thread: Adds a print job to the queue and notifies the printer thread to start processing.
// Ensure that the print queue can hold only one job at a time.

class PrintingService extends Thread{
    String data;
    boolean hasJob = false;

    //Producer method
    synchronized public void User(String value){
        while(hasJob){
            try{
                wait();
            } catch(Exception e){
                System.out.println(e);
            }
        }

        hasJob = true;
        data = value;
        System.out.println("Print job added.");
        notify();
    }

    //Consumer method
    synchronized public void Print(){
        while(!hasJob){
            try{
                wait();
            } catch(Exception e){
                System.out.println(e);
            }
        }

        hasJob = false;
        System.out.println("Printed: " + data);
        notify();
    }
}

class UserJob extends Thread{
    PrintingService print;

    UserJob(PrintingService print){
        this.print = print;
    }

    public void run(){
        String data = "Print task";
        print.User(data);
    }
}

class PrintJob extends Thread{
    PrintingService print;

    PrintJob(PrintingService print){
        this.print = print;
    }

    public void run(){
        print.Print();
    }
}

public class Ques6 {
    public static void main(String[] args) {
        PrintingService p = new PrintingService();

        UserJob u1 = new UserJob(p);
        PrintJob p1 = new PrintJob(p);

        u1.start();
        p1.start();
    }
}
