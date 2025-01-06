class Animal {
    Animal(){
        System.out.println("Animal class created !!!");
    }

    void eat(){
        System.out.println("Animal is eating........");
    }

    void sleep(){
        System.out.println("Animal is sleeping........");
    }
}

class Dog extends Animal {
    Dog(){
        super();
        System.out.println("Dog class created !!!");
    }

    void eat(){
        System.out.println("Dog is eating.....");
    }

    void sleep(){
        System.out.println("Dog is sleeping.....");
    }
}    

class Bird extends Animal {
    Bird(){
        super();
        System.out.println("Bird class created !!!");
    }

    void eat(){
        System.out.println("Bird is eating.....");
    }

    void sleep(){
        System.out.println("Bird is sleeping.....");
    }
}

public class InheritenceQues {
    public static void main(String[] args) {
        Animal A = new Animal();
        Bird B = new Bird();
        Dog D = new Dog();

        System.out.println();
        A.sleep();
        A.eat();
        B.sleep();
        B.eat();
        D.sleep();
        D.eat();
    }
}
