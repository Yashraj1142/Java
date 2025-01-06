//Program to create a method to calculate factorial.

class factorial {
    public static void main(String[] args) {
        long num = 6;
        long result = factorialCalc(num);

        System.out.println("Factorial of " + num + " = " + result);
    }

    public static long factorialCalc(long num){
        if(num<0){
            return -1;
        }
        else if(num<=1){
            return 1;
        }
        else{
            return num*factorialCalc(num-1);
        }
    }
}
