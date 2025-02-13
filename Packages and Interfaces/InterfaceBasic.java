// Defining an interface
interface Animal {
    void makeSound();  // Abstract method
}

// Implementing the interface in a class
class Dog implements Animal {
    public void makeSound() {  // Must be public
        System.out.println("Woof! Woof!");
    }
}

public class InterfaceBasic {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Output: Woof! Woof!
    }
}
