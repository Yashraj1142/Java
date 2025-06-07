public class Ques6 {
    public static void main(String[] args) {
        String score1 = "95";
        String score2 = "85";

        Integer intScore1 = Integer.valueOf(score1);
        Integer intScore2 = Integer.valueOf(score2);

        int result = intScore1.compareTo(intScore2);

        if(result>0){
            System.out.println("Score 1 is higher");
        } else if(result<0){
            System.out.println("Score 2 is higher");
        } else{
            System.out.println("Both the scores are equal");
        }
    }
}
