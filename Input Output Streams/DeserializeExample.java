import java.io.FileInputStream; //It will read raw bytes from a file
import java.io.ObjectInputStream;   //Reconstruct the object from the stream of bytes

public class DeserializeExample {
    public static void main(String[] args) {
        try {
            //Open the file from which we have to read
            FileInputStream fileIn = new FileInputStream("student.ser");
            
            //Wrapping the file stream with an object stream
            //This allows us to read object from the file, and not just the raw data
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // readObject() reads the next object from the stream.
            // Since it returns Object, we cast it to the Student (object)type.
            Student s = (Student) in.readObject();
            // Now we’ve successfully re-created the Student object from the file.

            //Close the streams
            in.close();
            fileIn.close();

            //Printing the deserialized object
            System.out.println("Deserialized Student:");
            System.out.println("ID: " + s.id + ", Name: " + s.name);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
