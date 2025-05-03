import java.io.File;

class CreateFile {
    public static void main(String[] args) {
        try{
            File file = new File("myfile.txt");

            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());
            } else{
                System.out.println("File already exists.");
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
