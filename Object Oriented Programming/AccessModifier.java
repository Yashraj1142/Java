class Example{
    private int marks = 12;     //private variable

    private int showMarks(){    //private method
        return marks;
    }
}

public class AccessModifier {
    public static void main(String args[]){
        Example e1 = new Example();

        System.out.println("Marks: " + e1.marks);   //This will give error
        System.out.println("Marks: " + e1.showMarks());   //This will give error
    }
}
