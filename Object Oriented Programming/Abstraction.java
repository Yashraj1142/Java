abstract class Vehicle{
    abstract void move();
}

class Car extends Vehicle{
    void move(){
        System.out.println("Car is moving.");
    }
}

public class Abstraction {
    public static void main(String args[]){
        Car c1 = new Car();

        c1.move();
    }
}
