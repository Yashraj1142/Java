class PlusOperatorConcat {
    public static void main(String args[]){
        String s1 = "Hello"+"World";     //output: HelloWorld
        String s2 = 20+30+"Hello"+20+30; //output: 50Hello2030
        
        System.out.println(s1);
        System.out.println(s2);
    }
}
