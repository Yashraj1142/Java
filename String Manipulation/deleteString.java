class deleteString {
    public static void main(String args[]){
        StringBuffer s1 = new StringBuffer("Hello");

        s1 = s1.delete(2, 4);
        System.out.println(s1);
    }
}
