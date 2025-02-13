//interface 1
interface Vehicle{
    void wheel();
}

//interface 2 - it extends interface 1
interface Colour extends Vehicle{
    void colour();
}

//implementing the interface colour
class Car implements Colour{
    public void wheel(){
        System.out.println("A car has four wheels.");
    }
    public void colour(){
        System.out.println("The colour of the car is Red");
    }
}

public class ExtendInterface {
    public static void main(String[] args) {
        Colour c1 = new Car();  //creating object 
        c1.wheel();
        c1.colour();
    }
}
