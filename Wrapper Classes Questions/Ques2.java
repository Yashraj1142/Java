import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        Map<String, Integer> studentScore = new HashMap<>();
        studentScore.put("Aniket", 90);
        studentScore.put("Tasmay", null);

        Integer score = studentScore.get("Tasmay");

        //Null-check before unboxing
        if(score!=null){
            int actualScore = score;    //Auto-unboxing
            System.out.println("The score is : " + actualScore);
        } else{
            System.out.println("Score is not available");
        }
    }
}
