//Program to find the position of the middle character.

public class middleCharacter {
    public static void main(String[] args) {
        String str  = "Hello java string";
        System.out.println("The middle character is : " + MiddleChar(str));
    }

    public static char MiddleChar(String s){
        if(s.isEmpty()){
            return 0;
        }

        int middle = s.length()/2;
        return s.charAt(middle);
    }
}
