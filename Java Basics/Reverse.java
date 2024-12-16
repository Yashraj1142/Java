//Print the reverse of a number
import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();
        int newNum = 0;

        while(num!=0){
            int rem = num%10;
            newNum = newNum*10 + rem;
            num = num/10;
        }
        System.out.println("The reverse of " + num + " is " + newNum);
    }
}
