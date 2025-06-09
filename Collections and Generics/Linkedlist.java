import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("First");
        names.add("Second");
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
    }
}
