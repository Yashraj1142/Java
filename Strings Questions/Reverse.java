//Program to reverse a string wihout using built-in reverse function

public class Reverse {
    public static void main(String[] args) {
        String str = "yash";
        for(int i=(str.length()-1);i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}