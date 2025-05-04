import java.awt.*;
import java.awt.event.*;

// A class that demonstrates GridLayout using Frame
class DemoGrid extends Frame {
    DemoGrid() {
        // Create an array of 12 buttons
        Button[] btn = new Button[12];

        // Set the layout of the frame to GridLayout with 4 rows and 3 columns
        setLayout(new GridLayout(4, 3)); // 4 rows x 3 columns

        // Loop to initialize and add buttons to the frame
        for (int i = 0; i < btn.length; i++) {
            btn[i] = new Button("Button " + (i + 1)); // Create a button with label
            add(btn[i]); // Add button to the frame
        }

        // Add a window listener to handle the window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Close the application when the window is closed
            }
        });
    }
}

// Main class to run the example
public class GridLayoutExmp {
    public static void main(String[] args) {
        DemoGrid demo = new DemoGrid(); // Create an instance of DemoGrid
        demo.setTitle("Example of Grid Layout."); // Set title of the frame
        demo.setSize(400, 150); // Set size of the frame
        demo.setVisible(true); // Make the frame visible
    }
}
