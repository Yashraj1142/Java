class stringLiteral {
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "Hello";    //new instance will not be created
        String s3 = "Hello";    //new instance will not be created

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
