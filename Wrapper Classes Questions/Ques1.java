public class Ques1{
    public static void main(String[] args) {
        String ageStr = "25";
        String salaryStr = "35000.50";

        //String -> primitives
        int age = Integer.parseInt(ageStr);
        double salary = Double.parseDouble(salaryStr);

        //Primitives -> string
        String ageOut = Integer.toString(age);
        String salaryOut = Double.toString(salary);

        System.out.println("Age: " + ageOut + ", Salary: " + salaryOut);
    }
}