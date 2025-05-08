// Write a Java program to create a thread by extending the Thread class. The thread should print numbers from 1 to 5 with a 1-second delay between prints.

class Ques1Exmp extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            } catch(Exception e){
                System.out.println(e);
            }
            
        }
    }
}

public class Ques1{
    public static void main(String[] args) {
        Ques1Exmp q = new Ques1Exmp();

        q.start();
    }
}