class Vehicle{
    String colour(){
        return "BLUE";
    }
}

class Car extends Vehicle{
    String colour(){
        return "YELLOW";
    }

    String ParentColour(){
        return super.colour();
    }
}

public class MethodOverriding {
    public static void main(String args[]){
        Car c1 = new Car();

        System.out.println("Colour in child class: " + c1.colour());
        System.out.println("Colour in parent class: " + c1.ParentColour());
    }
}
