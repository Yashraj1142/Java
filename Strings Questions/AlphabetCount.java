//program to count the number of each alphabet in a statement.

public class AlphabetCount {
    public static void main(String[] args) {
        String str = "Hello World";
        str = str.toLowerCase(); // Convert to lowercase for uniform counting
        int[] count = new int[26]; // Array to store counts of each alphabet

        // Count each alphabet
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') { // Only consider alphabets
                count[ch - 'a']++;
            }
        }

        // Print the counts
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println("Occurrence of " + (char) (i + 'a') + " = " + count[i]);
            }
        }
    }
}
