//Program to show the use of super keyword.

class Square{
    String colour = "Green";
}

class Circle extends Square{
    String colour = "Blue";

    void displayColor(){
        System.out.println("Colour of Circle: " + colour);
        System.out.println("Colour of Square: " + super.colour);
    }
}

class SuperKeyword {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.displayColor();
    }
}
