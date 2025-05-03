import java.io.FileReader;

class Reader {
    public static void main(String[] args) {
        try{
            //Create a FileReader to read from a file
            FileReader reader = new FileReader("D:\\Programing\\Java\\Input Output Streams\\file.txt");

            int data;

            //Read one character at a time
            while((data = reader.read()) != -1){
                System.out.println((char)data); //Convert int to char
            }

            reader.close(); //close the stream
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
