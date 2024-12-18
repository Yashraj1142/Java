class Vehicle{
    String colour = "Red";
}

class Car extends Vehicle{
    String colour = "Blue";

    void showColour(){
        System.out.println("Vehicle colour: " + colour);
        System.out.println("Car colour: " + super.colour);
    }
}

public class SuperKeyword {
    public static void main(String args[]){
        Car c1 = new Car();

    c1.showColour();
    }
}
