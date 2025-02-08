//program to convert a string to character array and finding the position of each character.

public class StringToCharArr {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch[] = new char[str.length()];

        for(int i=0;i<str.length();i++){
            ch[i] = str.charAt(i);
        }

        for(int j=0;j<ch.length;j++){
            System.out.println("Position of " + ch[j] + " = " + j);
        }
    }
}
