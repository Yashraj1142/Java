public class Ques4 {
    public static void main(String[] args) {
        double startTime;
        double endTime;

        int sum1 = 0;
        startTime = System.nanoTime();
        for(int i=0;i<10;i++){
            sum1+=i;
        }
        endTime = System.nanoTime();
        System.out.println("Time for primitive: " + (endTime-startTime));

        Integer sum2 = 0;
        startTime = System.nanoTime();
        for(Integer j=0;j<10;j++){
            sum2+=j;
        }
        endTime = System.nanoTime();
        System.out.println("Time for wrapper class: " + (endTime - startTime));
    }
}
