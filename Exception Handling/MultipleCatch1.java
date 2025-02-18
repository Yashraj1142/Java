public class MultipleCatch1 {
    public static void main(String[] args) {
        try{
            int i = 10/0;   //division by zero exception
            int[] num = {1,2,3};
            num[2] = 6;
        }
        catch(ArithmeticException obj1){
            System.out.println("Arithmetic Error");
            System.out.println(obj1);
        }
        catch(ArrayIndexOutOfBoundsException obj2){
            System.out.println("Array Index Error");
            System.out.println(obj2);
        }
    }
}
