//print the Fibonacci Series upto the given terms
import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int terms = input.nextInt();
        input.close();
        int j=0, k=1;
        
        System.out.print(j + " ");
        System.out.print(k + " ");
        for(int i=0;i<terms-2;i++){
            int nextTerm = j+k;
            System.out.print(nextTerm + " ");
            j = k;
            k = nextTerm;
        }
    }
}
