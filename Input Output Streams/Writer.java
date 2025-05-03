import java.io.FileWriter;

class Writer {
    public static void main(String[] args) {
        try{
            //create a FileWriter to write to a file
            FileWriter writer = new FileWriter("D:\\Programing\\Java\\Input Output Streams\\file.txt");

            //Write string to the file
            writer.write("Hello, this is using writer class.");

            writer.close(); //closing the stream
            System.out.println("Data written to the file");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
