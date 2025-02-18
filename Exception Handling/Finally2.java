public class Finally2 {
    public static void main(String[] args) {
        try{
            int i = 12/0;   //error will be generated
            System.out.println("Try block is executing.");
        }
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("Catch block is executing.");
        }
        finally{
            System.out.println("Finally block is executing.");
        }
    }
}
