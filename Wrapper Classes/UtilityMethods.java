public class UtilityMethods {
    public static void main(String[] args) {
        //ParseXxx(): String -> Primitive
        int intVal = Integer.parseInt("123");
        double doubleVal = Double.parseDouble("45.67");
        boolean boolVal = Boolean.parseBoolean("true");

        //valueOf(): String/Primitive -> wrapper object
        Integer intObj = Integer.valueOf("123");
        Double doubleObj = Double.valueOf(45.67);
        Boolean boolObj = Boolean.valueOf(true);

        // xxxValue(): Wrapper → primitive
        int i = intObj.intValue();
        double d = doubleObj.doubleValue();
        boolean b = boolObj.booleanValue();

        // toString(): Wrapper → String
        String intStr = intObj.toString();
        String boolStr = boolObj.toString();

        // compareTo(): Wrapper1.compareTo(Wrapper2)
        Integer a = 100;
        Integer c = 200;
        System.out.println("CompareTo: " + a.compareTo(c)); // -1

        // equals(): compare values
        System.out.println("Equals: " + a.equals(100)); // true

        // MAX_VALUE and MIN_VALUE
        System.out.println("Integer Max: " + Integer.MAX_VALUE);
        System.out.println("Double Min: " + Double.MIN_VALUE);

        // Character class methods
        char ch = 'A';
        System.out.println("Is Digit: " + Character.isDigit(ch));       // false
        System.out.println("Is Letter: " + Character.isLetter(ch));     // true
        System.out.println("To Lower Case: " + Character.toLowerCase(ch)); // a
        System.out.println("Is Upper Case: " + Character.isUpperCase(ch)); // true

        // compare(a, b): static method
        System.out.println("Integer.compare(10, 20): " + Integer.compare(10, 20)); // -1

        // hashCode()
        System.out.println("HashCode of intObj: " + intObj.hashCode());
    }
}
