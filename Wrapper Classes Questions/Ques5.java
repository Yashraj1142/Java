public class Ques5 {
    public static void main(String[] args) {
        Character ch = 'y';

        if(Character.isDigit(ch)){
            System.out.println("The input is a digit.");
        }
        else if(Character.isLetter(ch)){
            System.out.println("The character is a letter.");
            if(Character.isLowerCase(ch)){
                System.out.println("Uppercase: " + Character.toUpperCase(ch));
            }
        }
    }
}
