import java.util.Scanner;

class Prime{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        boolean isPrime = true;

        if(num<=1){
            isPrime = false;
        }
        else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
                else{
                    isPrime = true;
                }
            }
        }
        
        if(isPrime == true){
            System.out.println(num + " is Prime.");
        }
        else{
            System.out.println(num + " is not Prime.");
        }
    }
}
