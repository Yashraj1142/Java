// Create an interface Shape with a method double area().

// Implement this interface in two classes:
// Circle (has a radius and calculates area using π * r²)
// Rectangle (has length and width, calculates area using length * width)

// Write a main method to test both classes.

interface Shape{
    double area();
}

class Circle implements Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle implements Shape{
    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length*width;
    }
}

public class ShapeInterfaceImplementation {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Rectangle r1 = new Rectangle(5, 8);

        System.out.println("Area of the Circle = " + Math.round(c1.area()));
        System.out.println("Area of the Rectangle = " + r1.area());
    }
}
