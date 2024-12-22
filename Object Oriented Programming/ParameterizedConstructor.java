class Circle{
    double radius;
    double pi = 3.14;

    double Area(){
        return pi*radius*radius;
    }
    
    //parameter r is passed below
    Circle(double r){    
        radius = r;
    }
}

public class ParameterizedConstructor {
    public static void main(String args[]){
        Circle c1 = new Circle(10);     //value for the parameter r is passed here as 10

        double ar = c1.Area();
        System.out.println("The area is: " + ar);
    }
}
