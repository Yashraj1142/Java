public class Throws {
    public static void checkAge(int age) throws IllegalArgumentException{
        if(age<18){
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        else{
            System.out.println("Access Granted");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge(16);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception Caught");
            System.out.println(e);
        }
    }
}
