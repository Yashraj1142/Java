import java.awt.*;               // Import AWT classes for GUI components
import java.awt.event.*;         // Import AWT event classes

public class BorderLayoutExmp {
    public static void main(String[] args) {

        // Create a frame (top-level window) with a title
        Frame f = new Frame("Using the border layout frame");

        // Create a panel to hold components
        Panel p = new Panel();

        // Add the panel to the frame
        f.add(p);

        // Set BorderLayout to the panel
        p.setLayout(new BorderLayout());

        // Add buttons to different regions of the BorderLayout
        p.add(new Button("Place1"), BorderLayout.NORTH);   // Top
        p.add(new Button("Place2"), BorderLayout.SOUTH);   // Bottom
        p.add(new Button("Place3"), BorderLayout.EAST);    // Right
        p.add(new Button("Place4"), BorderLayout.WEST);    // Left
        p.add(new Button("Place5"), BorderLayout.CENTER);  // Center

        // Set size of the frame (width, height)
        f.setSize(300, 300);

        // Make the frame visible
        f.setVisible(true);

        // Add window listener to close the window properly
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);  // Exit the program when window is closed
            }
        });
    }
}
