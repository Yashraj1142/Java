import java.awt.*;                          // AWT classes (Frame, Button, etc.)
import java.awt.event.*;                    // AWT event classes (WindowAdapter)
import javax.swing.*;                       // Swing classes (BoxLayout)

public class BoxLayoutExmp extends Frame {  // Class extending AWT Frame
    Button buttons[];                       // Declare an array to hold buttons

    public BoxLayoutExmp() {
        buttons = new Button[5];            // Create an array for 5 buttons

        // Create and add 5 buttons to the frame
        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("The button number is: " + (i + 1)); // Create button
            add(buttons[i]);                // Add button to the frame
        }

        // Set the layout to BoxLayout with vertical alignment (Y_AXIS)
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Set the size of the frame
        setSize(400, 400);

        // Make the frame visible
        setVisible(true);

        // Add window listener to close the application when window is closed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);             // Exit the program
            }
        });
    }

    public static void main(String[] args) {
        // Create an instance of the class to display the frame
        BoxLayoutExmp box = new BoxLayoutExmp();
    }
}
