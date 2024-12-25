class insertString {
    public static void main(String args[]){
        StringBuffer s1 = new StringBuffer("hello");

        s1 = s1.insert(2, "HELLO");
        System.out.println(s1);
    }
}
