import java.util.*;

public class Autoboxing{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //Autoboxing: int -> Integer
        list.add(5);
        list.add(10);

        //Unboxing: Integer -> int
        int sum = list.get(0) + list.get(1);

        System.out.println("Sum: " + sum);
    }
}