class Vehicle6{
    void move(){
        System.out.println("Moving.....");
    }
}

class Car2 extends Vehicle6{
    void fourWheeler(){
        System.out.println("Car has four wheels.");
    }
}

class Hyundai extends Car2{
    void brand(){
        System.out.println("Hyundai is best.");
    }
} 

public class MultilevelInheritence {
    public static void main(String args[]){
        Hyundai c1 = new Hyundai();
        
        c1.brand();
        c1.fourWheeler();
        c1.move();
    }
}
