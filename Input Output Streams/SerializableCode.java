import java.io.Serializable;    //marker interface that allows object to be serialized
import java.io.ObjectOutputStream;  //used to convert object to byte stream
import java.io.FileOutputStream;    //used to write that byte stream to a file

class Student implements Serializable{
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class SerializableCode{
    public static void main(String[] args) {
        try{
            //Creating an object of class
            Student s1 = new Student(101, "ABC");

            //Create a file output stream that points to the file where we want to save the object
            FileOutputStream fileOut = new FileOutputStream("student.ser");

            //Create an object output stream to wrap around the file output stream
            //This will allow us to convert the object into a byte stream and write it to the file
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            //Serialize the object and write it to the file
            //This converts the Student object into a byte stream and saves it inside "student.ser"
            out.writeObject(s1);

            //Closing the streams
            out.close();
            fileOut.close();

            System.out.println("Object has been serialized and saved to student.ser");
        } 
        catch (Exception e){
            System.out.println(e);
        }
    }
}
