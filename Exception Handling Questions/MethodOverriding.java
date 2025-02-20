// Create a parent class with a method that declares an exception. 

// Inherit a child class and override that method. 

// Handle the exception properly while following method overriding rules for exceptions in Java.

class Parent {
    void show() throws Exception {
        System.out.println("Parent class method.");
        throw new Exception("Exception from Parent class.");
    }
}

class Child extends Parent {
    @Override
    void show() throws ArithmeticException {
        System.out.println("Child class method.");
        throw new ArithmeticException("Exception from Child class.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();

        try {
            obj.show();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
