class Counter{
    int count = 0;

    void increment(){
        count++;
    }
}

class UnsyncExample extends Thread{
    Counter c;

    UnsyncExample(Counter c){
        this.c = c;
    }

    public void run(){
        for(int i=0;i<1000;i++){
            c.increment();
        }
    }
}

public class Unsynchronized {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();

        UnsyncExample t1 = new UnsyncExample(c);
        UnsyncExample t2 = new UnsyncExample(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final value: " + c.count);
        //the output may be <2000 sometimes
    }
}
