import java.io.FileOutputStream;

class OutputStream {
    public static void main(String[] args) {
        try{
            //Connect FileOutputStream to a file
            FileOutputStream file = new FileOutputStream("D:\\Programing\\Java\\Input Output Streams\\file.txt");

            String text = "This line will be written to the file.";

            //Convert string to buytes and write
            file.write(text.getBytes());

            file.close();   //close the stream
            System.out.println("Data written to the file.");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
