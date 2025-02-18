public class NestedTry {
    public static void main(String[] args) {
        try{
            int i = 10/0;   //division by zero exception
            try{
                int[] arr = {1,2,3};
                arr[5] = 6;     //ArrayIndexOutOfBound exception
            }
            catch(ArrayIndexOutOfBoundsException obj1){
                System.out.println("Error Found in Inner Try Block.");
                System.out.println(obj1);
            }
        }
        catch(ArithmeticException obj2){
            System.out.println("Error Found in Outer Try Block.");
            System.out.println(obj2);
        }
    }
}
