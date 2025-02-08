//Program to find out the number of words in a string.

public class NumberOfWords {
    public static void main(String[] args) {
        String str = "Welcome to my program";

        int space=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                space = space + 1;
            }
        }

        int words = space + 1;
        System.out.println("Number of words = " + words);
    }
}
