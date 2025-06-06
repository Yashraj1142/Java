public class Creating{
    public static void main(String[] args) {
        //Using valeOf()
        Integer obj1 = Integer.valueOf(10);

        //Autoboxing
        Integer obj2 = 20;

        //Constructor (Deprecated)
        // Integer obj3 = new Integer(30);

        //From string
        Integer obj4 = Integer.valueOf("40");
        int obj5 = Integer.parseInt("50");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj4);
        System.out.println(obj5);
    }
}