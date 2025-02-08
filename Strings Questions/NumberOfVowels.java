//Program to count number of each vowel in a given string

public class NumberOfVowels {
    public static void main(String[] args) {
        String str = "This is an example of program.";
        str = str.toLowerCase();
        int[] count = new int[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count[ch - 'a']++;
            }
        }

        System.out.println("Number of vowels: ");
        for(int j=0;j<str.length();j++){
            if(count[j] > 0){
                System.out.println("Occurence of " + (char) (j+'a') + "=" + count[j]);
            }
        }
    }
}
