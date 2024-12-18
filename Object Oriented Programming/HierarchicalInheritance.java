class Vehicle{
    void move(){
        System.out.println("Moving.....");
    }
}

class Car extends Vehicle{
    void fourWheeler(){
        System.out.println("Car has four wheels.");
    }
}

class Bike extends Vehicle{
    void twoWheeler(){
        System.out.println("Bike has two wheels.");
    }
}

public class HierarchicalInheritance {
    public static void main(String args[]){
        Car c1 = new Car();
        Bike b1 = new Bike();

        c1.fourWheeler();
        c1.move();

        b1.twoWheeler();
        b1.move();
    }
}
