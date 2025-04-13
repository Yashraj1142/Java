class MultiThreadExample extends Thread{
    public void run(){
        System.out.println("Thread name = " + Thread.currentThread().getName());
    }
}

public class MultipleThreadByExtend {
    public static void main(String[] args) {
        MultiThreadExample t1 = new MultiThreadExample();
        MultiThreadExample t2 = new MultiThreadExample();
        MultiThreadExample t3 = new MultiThreadExample();

        t1.start();
        t2.start();
        t3.start();
    }
}
