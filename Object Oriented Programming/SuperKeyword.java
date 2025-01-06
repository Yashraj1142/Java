class Vehicle4{
    String colour = "Red";
}

class Car3 extends Vehicle4{
    String colour = "Blue";

    void showColour(){
        System.out.println("Vehicle colour: " + colour);
        System.out.println("Car colour: " + super.colour);
    }
}

public class SuperKeyword {
    public static void main(String args[]){
        Car3 c1 = new Car3();

    c1.showColour();
    }
}
