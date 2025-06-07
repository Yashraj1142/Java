import java.util.*;

public class Ques3 {
    public static void main(String[] args) {
        ArrayList<Double> temp = new ArrayList<>();

        temp.add(35.12);
        temp.add(32.08);
        temp.add(39.45);
        temp.add(41.25);
        temp.add(37.10);

        double sum = 0;
        for(int i=0;i<temp.size();i++){
            sum = sum + temp.get(i);
        }
        double avg = sum/(temp.size());

        System.out.println("The temperatures are: ");
        for(int j=0;j<temp.size();j++){
            System.out.println((temp.get(j)).toString());
        }
        System.out.println("Average Temp: " + avg);
        
    }
}
