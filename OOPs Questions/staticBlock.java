//program to show that static block is executed before main() method in Java.

class staticBlock {
    public static void main(String[] args) {
        System.out.println("This is main method.");
    }

    static{
        System.out.println("This is static block.");
    }
}
