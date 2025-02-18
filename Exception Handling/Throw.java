public class Throw {
    public static void main(String[] args) {
        int age = 12;

        if(age<18){
            throw new ArithmeticException("You are under age");
        }
        else{
            System.out.println("Welcome to driving school.");
        }
    }
}
