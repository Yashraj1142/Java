//Program to show constructor overloading.

class Consts{
    String name;
    int age;

    //constructor 1 : no argument
    Consts(){
        name = "Unknown";
        age = 0;
    }

    //constructor 2 : one argument
    Consts(String name){
        this.name = name;
        age = 0;
    }

    //constructor 3 : two arguments
    Consts(String name, int age){
        this.name = name;
        this.age = age;
    }

    //method to display informations
    void dispInfo(){
        System.out.println("Name: " + name);
        System.err.println("Age: " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        //using constructor 1
        Consts c1 = new Consts();
        System.out.println("Constructor 1");
        c1.dispInfo();
        
        //using constructor 2
        Consts c2 = new Consts("Rahul");
        System.out.println("Constructor 2");
        c2.dispInfo();

        //using constructor 3
        Consts c3 = new Consts("Armaan", 19);
        System.out.println("Constructor 3");
        c3.dispInfo();
    }
}
