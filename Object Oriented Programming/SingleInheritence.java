class Vehicle3{
    void move(){
        System.out.println("Moving.....");
    }
}

class Car extends Vehicle3{
    void fourWheeler(){
        System.out.println("Car has four wheels.");
    }
}

public class SingleInheritence {
    public static void main(String args[]){
        Car c1 = new Car();

        c1.fourWheeler();
        c1.move();
    }
}
