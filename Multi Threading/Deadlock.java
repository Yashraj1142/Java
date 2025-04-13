public class Deadlock {

    // Two shared objects used as locks
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {

        //Thread 1 tries to acquire lock1 first, then lock2
        Thread t1 = new Thread(()->{
            synchronized(lock1){    // Acquires lock1
                System.out.println("Thread 1: Locked lock 1");

                try{
                    Thread.sleep(1000);
                } catch(Exception e){
                    System.out.println(e);
                }
    
                synchronized(lock2){    //Acquires lock2
                    System.out.println("Thread 2: Locked lock 2");
                }
            }
        });

        //Thread 2 tries to acquire lock2 first, then lock1
        Thread t2 = new Thread(()->{
            synchronized(lock2){    // Acquires lock2
                System.out.println("Thread 2: Locked lock 2");

                try{
                    Thread.sleep(1000);
                } catch(Exception e){
                    System.out.println(e);
                }
    
                synchronized(lock1){    //Acquires lock1
                    System.out.println("Thread 2: Locked lock 1");
                }
            }
        });

        //starting both the threads
        t1.start();
        t2.start();
    }
}
