// Write a Java program that takes a user’s input as a string and converts it to an integer using Integer.parseInt().

// If the user enters a non-numeric value, catch the NumberFormatException and display an appropriate message.

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numeric string: ");
        String s1 = input.nextLine();

        try{
            int num = Integer.parseInt(s1);
            System.out.println("The result after conversion: " + num);
        }
        catch(NumberFormatException exp){
            System.out.println();
            System.out.println("!!! Error Occured !!!");
            System.out.println("Error details: " + exp.getMessage());
        }

        input.close();
    }
}
