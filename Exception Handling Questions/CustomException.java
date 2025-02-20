// Create a custom exception class called InvalidAgeException. 
// Write a method that takes an age as input:
// If the age is less than 18, throw the InvalidAgeException.
// Otherwise, print "You are eligible to vote".

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class Age{
    void AgeCheck(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("You are eligible to vote.");
        }
        else{
            System.out.println("You are eligible to vote.");
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        Age a1 = new Age();
        
        try{
            a1.AgeCheck(16);
        }
        catch(InvalidAgeException exp){
            System.out.println("!!! Error Occured !!!");
            System.out.println(exp.getMessage());
        }
    }
}