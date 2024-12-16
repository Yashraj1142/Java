//checking whether a given number is an Armsrtong number or not
import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();
        int numDigits = 0;
        int sum = 0;

        int a = num;
        while(a!=0){
            a = a/10;
            numDigits = numDigits + 1;
        }
        
        int b = num;
        while(b!=0){
            int rem = b%10;
            sum = sum + (int)Math.pow(rem, numDigits);
            b = b/10;
        }

        if(num == sum){
            System.out.println(num + " is an Armstrong number.");
        }
        else{
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
