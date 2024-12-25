class replace {
    public static void main(String args[]){
        StringBuffer s1 = new StringBuffer("Hello World");

        s1 = s1.replace(2, 6, "BYEEEE");
        System.out.println(s1);
    }
}
