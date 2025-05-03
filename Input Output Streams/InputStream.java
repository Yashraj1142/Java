import java.io.FileInputStream;

class InputStream{
    public static void main(String[] args) {
        try{
            //Connecting the FileInputStream to a file
            FileInputStream file = new FileInputStream("D:\\Programing\\Java\\Input Output Streams\\file.txt");

            int data;

            //Read and print one byte at a time
            while((data = file.read()) != -1){
                System.out.println((char)data);
            }

            file.close();   //closing the file
        } catch(Exception e){
            System.out.println("Error");
        }
    }
}