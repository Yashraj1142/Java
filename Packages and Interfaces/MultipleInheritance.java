//interface 1
interface Vehicle{
    void wheel();
}

//interface 2
interface Car{
    void colour();
}

//class extending both interface 1 and 2
class Info implements Car, Vehicle{
    public void colour(){
        System.out.println("The colour of the car is Red");
    }

    public void wheel(){
        System.out.println("There are 4 wheels in a car.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Info c1 = new Info();   //object of info class
        c1.wheel();
        c1.colour();
    }
}
