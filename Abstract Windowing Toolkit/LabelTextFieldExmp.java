import java.awt.*;           // Import AWT classes for GUI components
import java.awt.event.*;     // Import AWT event classes for handling events

// Create a class that extends Frame to build a GUI window
public class LabelTextFieldExmp extends Frame {

    // Declare Label and TextField as instance variables
    Label l1;
    TextField t1;

    // Constructor to set up GUI components
    LabelTextFieldExmp() {
        // Use null layout to manually set component positions
        setLayout(null);

        // Create a Label with the text "name"
        l1 = new Label("name");
        // Set position and size: x=30, y=60, width=50, height=30
        l1.setBounds(30, 60, 50, 30);

        // Create a TextField with 30 columns
        t1 = new TextField(30);
        // Set position and size: x=120, y=60, width=150, height=30
        t1.setBounds(120, 60, 150, 30);

        // Add Label and TextField to the Frame
        this.add(l1);
        this.add(t1);

        // Add a window listener to handle the window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // Exit the program when the window is closed
                System.exit(0);
            }
        });
    }

    // Main method to launch the application
    public static void main(String[] args) {
        // Create an instance of the Frame
        LabelTextFieldExmp demo = new LabelTextFieldExmp();

        // Set the title of the window
        demo.setTitle("Label and Text Field Example.");

        // Set the size of the window
        demo.setSize(300, 300);

        // Make the window visible
        demo.setVisible(true);
    }
}
