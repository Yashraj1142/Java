class Circle{
    double radius;
    double pi = 3.14;

    double Area(){
        return pi*radius*radius;
    }

    Circle(){       //no parameters are passed
        radius = 10;
    }
}

public class DefaultConstructor {
    public static void main(String args[]){
        Circle c1 = new Circle();

        double ar = c1.Area();
        System.out.println("The area is: " + ar);
    }
}
