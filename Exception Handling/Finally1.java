public class Finally1 {
    public static void main(String[] args) {
        try{
            int i = 12/3;
            System.out.println("Try block is executing");
        } 
        catch (ArithmeticException obj){
            System.out.println("Catch block is executing.");
        } 
        finally{
            System.out.println("Finally block is executing.");
        }
    }
}
