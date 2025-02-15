// Create an interface Sports with:
// void play()
// A default method void showRules() that prints “Follow the official sports rules.”

// Implement it in a class Football where play() prints “Playing football!”.

// Override showRules() to print "Football rules: No hands allowed!".

// Test in main().

interface Sports{
    void play();
    default void showRules(){
        System.out.println("Follow the official sports rule.");
    }
}

class Football implements Sports{
    public void play(){
        System.out.println("Playing Football !");
    }

    public void showRules(){
        System.out.println("Football rules: No hands allowed !");
    }
}


public class SportsInterface {
    public static void main(String[] args) {
        Football f1 = new Football();

        f1.play();
        f1.showRules();
    }
}
