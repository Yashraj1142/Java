// Create a program that launches two threads: one prints odd numbers, the other prints even numbers from 1 to 10.

class EvenThread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

class OddThread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

public class Ques3 {
    public static void main(String[] args) {
        EvenThread e = new EvenThread();
        OddThread o = new OddThread();

        e.start();
        o.start();
    }
}
