class MultiThreadExampleRunnable implements Runnable{
    public void run(){
        System.out.println("Thread name = " + Thread.currentThread().getName());
    }
}

public class MultipleThreadbyRunnable {
    public static void main(String[] args) {
        MultiThreadExampleRunnable obj1 = new MultiThreadExampleRunnable();
        MultiThreadExampleRunnable obj2 = new MultiThreadExampleRunnable();
        MultiThreadExampleRunnable obj3 = new MultiThreadExampleRunnable();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);

        t1.start();
        t2.start();
        t3.start();
    }
}
