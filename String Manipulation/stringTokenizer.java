import java.util.StringTokenizer;

class stringTokenizer {
    public static void main(String[] args) {
        StringTokenizer s1 = new StringTokenizer("This ,is; a string");

        int tokNum = s1.countTokens();
        System.out.println(tokNum);
    }
}
