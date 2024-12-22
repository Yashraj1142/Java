class Student{
    int id;
    String name;
    static String collgeName = "XYZ";

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    static void ChangeCllgName(){
        collgeName = "ABC";
    }

    void details(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("College: " + collgeName + "\n");
    }
}

public class staticKeyword {
    public static void main(String args[]){
        Student s1 = new Student(23, "John");
        Student s2 = new Student(43, "Roman");
        Student s3 = new Student(19, "Cody");

        s1.details();
        s2.details();

        Student.ChangeCllgName();

        s3.details();
    }
}
