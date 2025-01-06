//Program to show method overloading.

class Maths{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}
class MethodOverloading {
    public static void main(String[] args) {
        Maths m1 = new Maths();
        Maths m2 = new Maths();

        int res1 = m1.add(2, 4);
        double res2 = m2.add(23.55, 31.76);

        System.out.println("Calling the int method: " + res1);
        System.out.println("Calling the int method: " + res2);
    }
}
