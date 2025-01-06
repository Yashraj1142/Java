class Circle2{
    double radius;
    double pi = 3.14;

    double Area(){
        return pi*radius*radius;
    }

    void setValue(int rad){
        radius = rad;
    }
}

public class ParameterizedMethod {
    public static void main(String args[]){
        Circle2 c1 = new Circle2();

        c1.setValue(10);

        double ar = c1.Area();
        System.out.println(("The area of the circle: " + ar));
    }
}
