public class Finally3 {
    public static void main(String[] args) {
        try{
            int i = 12/0;   //division by zero error
            System.out.println("Try is executing.");
        }
        catch(ArithmeticException obj){
            System.out.println("Catch block is executing");
        }
        finally{
            System.out.println("Finally block is executing.");
        }
    }
}
