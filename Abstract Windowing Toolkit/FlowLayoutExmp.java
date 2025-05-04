import java.awt.*;              // For AWT classes like Frame, Button, FlowLayout
import java.awt.event.*;        // For event handling like WindowAdapter, WindowEvent

// Custom frame class demonstrating FlowLayout
class DemoFlowLayout extends Frame {
    
    // Constructor
    DemoFlowLayout() {
        Button[] btn = new Button[10];           // Create an array to hold 10 buttons
        setLayout(new FlowLayout());             // Set the layout to FlowLayout

        // Loop to create and add buttons to the frame
        for (int i = 0; i < btn.length; i++) {
            btn[i] = new Button("Button " + (i + 1));  // Create button with label
            add(btn[i]);                               // Add button to the frame
        }

        // Add window listener to close the window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);                     // Exit the program when window is closed
            }
        });
    }
}

// Main class to run the FlowLayout example
public class FlowLayoutExmp {
    public static void main(String[] args) {
        DemoFlowLayout demoflow = new DemoFlowLayout();      // Create instance of the frame
        demoflow.setTitle("Buttons arranged in the flow layout"); // Set window title
        demoflow.setSize(400, 200);                          // Set window size
        demoflow.setVisible(true);                           // Make window visible
    }
}
