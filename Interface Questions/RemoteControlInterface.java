// Design an interface RemoteControl with methods:
// void turnOn(),
// void turnOff(),
// void changeChannel(int channel).

// Implement this interface in a class TV.
// turnOn() should print “TV is ON”,
// turnOff() should print “TV is OFF”,

// changeChannel(5) should print “Channel changed to 5”.

// Test it in main().

interface RemoteControl{
    void turnOn();
    void turnOff();
    void changeChannel(int channel);
}

class TV implements RemoteControl{
    public void turnOn(){
        System.out.println("TV is ON");
    }

    public void turnOff(){
        System.out.println("TV is OFF");
    }

    public void changeChannel(int channel){
        System.out.println("Channel changes to " + channel);
    }
}


public class RemoteControlInterface {
    public static void main(String[] args) {
        TV t1 = new TV();
        t1.turnOn();
        t1.turnOff();
        t1.changeChannel(5);
    }
}