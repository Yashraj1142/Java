class SharedBuffer{
    int data;
    boolean hasValue = false;

    //producer method
    synchronized void produce(int value){
        while(hasValue){
            try{
                wait(); //wait if the buffer is full
            } catch(Exception e){
                System.out.println(e);
            }
        }

        data = value;
        hasValue = true;
        System.out.println("Produced: " + value);
        notify();   //Notify the consumer thread
    }

    //Consumer method
    synchronized void consume(){
        while(!hasValue){
            try{
                wait();
            } catch(Exception e){
                System.out.println(e);
            }
        }

        System.out.println("Consumed value: " + data);
        hasValue = false;
        notify();   //Notify the producer thread
    }
}

class Producer extends Thread{
    SharedBuffer b;

    Producer(SharedBuffer b){
        this.b = b;
    }

    public void run(){
        int val = (int)(Math.random()*100);
        b.produce(val);
    }
}

class Consumer extends Thread{
    SharedBuffer b;

    Consumer(SharedBuffer b){
        this.b = b;
    }

    public void run(){
        b.consume();
    }
}

public class Intercommunication {
    public static void main(String[] args) {
        SharedBuffer b = new SharedBuffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}
