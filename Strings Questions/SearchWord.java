//Program to search a given word in a string.

public class SearchWord {
    public static void main(String[] args) {
        String str = "Hello! Welcome to my program";
        String target = "my";

        int index = str.indexOf(target);

        if(index==-1){
            System.out.println("The word is not present in a string.");
        }
        else{
            System.out.println("The word is present at index : " + index);
        }
    }
}
