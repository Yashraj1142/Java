import java.io.File;

public class DeletingFile {
    public static void main(String[] args) {
        try{
            File file = new File("RenamedFile.txt");

            if(file.delete()){
                System.out.println("File deleted successfully");
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
