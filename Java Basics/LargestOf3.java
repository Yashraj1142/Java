//finding largest number among given three
import java.util.Scanner;

public class LargestOf3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        input.close();

        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is largest among three.");
        }
        else if(num2>num3){
            System.out.println(num2 + " is largest among three.");
        }
        else{
            System.out.println(num3 + " is largest among three.");
        }
    }
}
