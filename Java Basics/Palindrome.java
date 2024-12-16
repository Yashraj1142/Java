//checking whether a given number is a palinddrome or not
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();
        int newNum = 0;

        int a = num;
        while(a!=0){
            int rem = a%10;
            newNum = newNum*10 + rem;
            a = a/10;
        }

        if(newNum == num){
            System.out.println("The given number is a palinrome.");
        }
        else{
            System.out.println("The given number is not a Plaindrome.");
        }
    }
}
