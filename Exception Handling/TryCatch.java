public class TryCatch {
    public static void main(String[] args) {
        
        try{
            int i = 10/0;   //division by zero exception
        }
        catch(ArithmeticException obj){
            System.out.println("Error Found.");
            System.out.println(obj);    //shows the exception type
        }
    }
}