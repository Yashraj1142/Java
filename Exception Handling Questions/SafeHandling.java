// Write a program that takes two integers as input and performs division. 

// If the denominator is zero, catch the ArithmeticException and display an appropriate message.

import java.util.Scanner;

public class SafeHandling{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int num = input.nextInt();
        System.out.print("Enter the denominator: ");
        int den = input.nextInt();

        try{
            int result = num/den;
            System.out.println("The division result is: " + result);
        }
        catch(ArithmeticException exp){
            System.out.println();
            System.out.println("!!! Error in computation !!!");
            System.out.println("Error details: " + exp.getMessage());
        }

        input.close();
    }
}