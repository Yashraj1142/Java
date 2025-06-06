public class Comparison {
    public static void main(String[] args) {
        long startTime, endTime;

        //Using primitives
        startTime = System.nanoTime();
        int sum1 = 0;
        for(int i=0;i<10;i++){
            sum1 += i;
        }
        endTime = System.nanoTime();

        System.out.println("Primitive Time: " + (endTime - startTime));

        //Using Wrapper Classes
        startTime = System.nanoTime();
        Integer sum2 = 0;
        for(int i=0;i<10;i++){
            sum2 += i;  //Auto-boxing and re-boxing happens
        }
        endTime = System.nanoTime();

        System.out.println("Wrapper Class Time: " + (endTime - startTime));
    }
}
