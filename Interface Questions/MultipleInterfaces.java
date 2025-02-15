// Create two interfaces:
// Animal with a method void makeSound().
// Pet with a method void play().

// Implement both interfaces in a class Dog.
// makeSound() should print “Dog barks”
// play() should print “Dog is playing”

// Create a main method to test it.

interface Animal{
    void makeSound();
}

interface Pet{
    void play();
}

class Dog implements Animal, Pet{
    public void makeSound(){
        System.out.println("Dog Barks.");
    }

    public void play(){
        System.out.println("Dog is playing.");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.makeSound();
        d1.play();
    }
}
