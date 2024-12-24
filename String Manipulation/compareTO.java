class compareTO {
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "abcd";
        String s3 = "Hello";

        System.out.println(s1.compareTo(s3));   //it will return zero.
        System.out.println(s1.compareTo(s2));   //it will return non-zero value.
        System.out.println(s2.compareTo(s1));   //it will return non-zero value.
    }
}
