import java.util.Scanner;

class OddEven{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        if(num%2 == 0){
            System.out.println(num + " is Even.");
        }
        else{
            System.out.println(num + " is Odd");
        }
    }
}