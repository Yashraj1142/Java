//1. Create a user-defined exception
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

//2. Use the custom exception in a method
public class UserDefinedExcp {
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or more.");
        }
        else{
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) {
        try{
            checkAge(16);
        }
        catch(InvalidAgeException exp){
            System.out.println("Exception Caught");
            System.out.println(exp);
        }
    }
}
