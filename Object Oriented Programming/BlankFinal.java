class Example{
    final int i;
    static final int j;

    Example(){      //constructor
        i=20;
    }

    static{     //static block
        j=40;
    }
}

public class BlankFinal {
    public static void main(String args[]){
        Example e1 = new Example();

        System.out.println("i = " + e1.i);
        System.out.println("j = " + e1.j);
    }
}
