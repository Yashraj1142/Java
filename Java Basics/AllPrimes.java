//print all the primes between two given numbers
import java.util.Scanner;

public class AllPrimes {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        

        System.out.print("Print the first number: ");
        int num1 = input.nextInt();
        System.out.print("Print the second number: ");
        int num2 = input.nextInt();
        input.close();
        boolean isPrime = false;

        for(int i=num1+1;i<num2;i++){
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
                else{
                    isPrime = true;
                }
            }
            if(isPrime == true){
                System.out.println(i);
            }
        }
    }
}
