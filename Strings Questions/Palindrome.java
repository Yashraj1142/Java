// Program to check whether a given string is Palindrome or not.

public class Palindrome {
    public static void main(String[] args) {
        String str = "Radar";
        String reverseStr = "";

        for(int i=(str.length()-1);i>=0;i--){
            reverseStr = reverseStr + str.charAt(i);
        }

        if(reverseStr.equalsIgnoreCase(str)){
            System.out.println("The given string is a palindrome.");
        }
        else{
            System.out.println("The given string is not a palindrome.");
        }
    }
}
