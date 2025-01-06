class Vehicle3{
    void move(){
        System.out.println("Moving.....");
    }
}

class Car2 extends Vehicle3{
    void fourWheeler(){
        System.out.println("Car has four wheels.");
    }
}

public class SingleInheritence {
    public static void main(String args[]){
        Car2 c1 = new Car2();

        c1.fourWheeler();
        c1.move();
    }
}
