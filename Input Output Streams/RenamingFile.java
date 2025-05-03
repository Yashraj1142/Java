import java.io.File;

class RenamingFile {
    public static void main(String[] args) {
        try{
            File oldFile = new File("myfile.txt");
            File newFile = new File("RenamedFile.txt");

            if(oldFile.renameTo(newFile)){
                System.out.println("File renamed successfully");
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
