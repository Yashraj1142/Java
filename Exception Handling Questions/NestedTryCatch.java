// Write a program that performs the following inside a nested try-catch block:
// Outer try: Attempts to divide a number by zero.
// Inner try: Declares a null string and tries to call .length().
// Handle ArithmeticException and NullPointerException separately.

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int num = input.nextInt();
        System.out.print("Enter the denominator: ");
        int den = input.nextInt();

        input.nextLine();

        try{
            int i = num/den;
            System.out.println("The result on division = " + i);

            try{
                String str = null;
                int len = str.length();
                System.out.println("The length of the string is: " + len);
            }
            catch(NullPointerException exp1){
                System.out.println();
                System.out.println("!!! Error Occured !!!");
                System.out.println("Error detail: " + exp1.getMessage());
            }
        }
        catch(ArithmeticException exp2){
            System.out.println();
            System.out.println("!!! Error Occured !!!");
            System.out.println("Error detail: " + exp2.getMessage());
        }

        input.close();
    }
}
