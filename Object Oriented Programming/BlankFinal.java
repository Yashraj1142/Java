class Example2{
    final int i;
    static final int j;

    Example2(){      //constructor
        i=20;
    }

    static{     //static block
        j=40;
    }
}

public class BlankFinal {
    public static void main(String args[]){
        Example2 e1 = new Example2();

        System.out.println("i = " + e1.i);
        System.out.println("j = " + e1.j);
    }
}
