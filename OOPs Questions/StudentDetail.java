import java.util.Scanner;

class Student{
    String name;
    int age;

    //Default constructor
    Student(){
        name = "Rahul";
        age = 18;
    }

    //Parameterized Constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class StudentDetail{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = input.nextLine();
        System.out.println("Enter the age: ");
        int age = input.nextInt();

        Student s1 = new Student(); //using the default constructor
        Student s2 = new Student(name, age);   //using the parameterized constructor

        System.out.println("Default: name = " + s1.name + " age = " + s1.age);
        System.out.println("Parameterized: name = " + s2.name + " age = " + s2.age);

        input.close();
    }
}