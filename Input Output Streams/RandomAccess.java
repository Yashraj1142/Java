import java.io.RandomAccessFile;

class RandomAccess {
    public static void main(String[] args) {
        try{
            RandomAccessFile raf = new RandomAccessFile("data.txt", "rw");

            raf.writeUTF("Hello Everyone"); //writing into the file
            raf.seek(0);    //Move to the beginning

            String text = raf.readUTF();    //reading from the file
            System.out.println("Read from file: " + text);

            raf.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
