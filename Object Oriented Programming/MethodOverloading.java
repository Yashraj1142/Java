class Addition{
    int add(int a, int b){
        return a+b;
    }

    //creating a method with same name but with different number of arguments
    int add(int a, int b, int c){
        return a+b+c;
    }
    
    //creating a method with same name but different data types of the arguments
    double add(double a, double b){
        return a+b;
    }
}

public class MethodOverloading {
    public static void main(String args[]){
        Addition a1 = new Addition();

        int x = a1.add(12,13);
        System.out.println("12 + 13 = " + x);

        double y = a1.add(24, 32.4);
        System.out.println("24 + 32.4 = " + y);
    }
}
