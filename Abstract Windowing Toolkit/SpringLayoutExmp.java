import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SpringLayoutExmp {
    private JFrame f;       // Main frame
    private JLabel l1;      // Top label
    private JLabel l2;      // Bottom label
    private JPanel p;       // Panel to hold form elements

    // Constructor
    public SpringLayoutExmp(){
        demoGUI();          // Set up GUI
    }

    // Main method to launch the program
    public static void main(String[] args) {
        SpringLayoutExmp demo = new SpringLayoutExmp();
        demo.showSpring();  // Set content of the SpringLayout
    }

    // Method to create basic GUI layout
    private void demoGUI(){
        f = new JFrame("Example of a spring layout.");
        f.setSize(400, 400);
        f.setLayout(new GridLayout(3, 1)); // Divides frame into 3 rows

        l1 = new JLabel("", JLabel.CENTER);  // Label for top row
        l2 = new JLabel("", JLabel.CENTER);  // Label for bottom row
        l2.setSize(350, 100);                // Optional size setting

        // Close the application when window is closed
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }            
        });

        p = new JPanel();                  // Center panel
        p.setLayout(new FlowLayout());    // Initial layout (will be replaced)

        // Add components to frame
        f.add(l1); // Top
        f.add(p);  // Middle
        f.add(l2); // Bottom

        f.setVisible(true); // Show frame
    }

    // Method to set up SpringLayout with label and text field
    private void showSpring(){
        l1.setText("Spring Layout");              // Set top label text
        SpringLayout layout1 = new SpringLayout();

        JPanel p1 = new JPanel();                 // New panel for layout
        p.setLayout(layout1);                     // Set SpringLayout to 'p'

        JLabel l3 = new JLabel("Enter name: ");   // Label for input
        JTextField t1 = new JTextField("", 15);   // Text field for input

        p1.add(l3);  // Add label to inner panel
        p1.add(t1);  // Add text field to inner panel

        // Set constraints: l3 is 5px from top-left of p1
        layout1.putConstraint(SpringLayout.WEST, l3, 5, SpringLayout.WEST, p1);
        layout1.putConstraint(SpringLayout.NORTH, l3, 5, SpringLayout.NORTH, p1);

        layout1.putConstraint(SpringLayout.WEST, t1, 5, SpringLayout.EAST, l3);
        layout1.putConstraint(SpringLayout.NORTH, t1, 5, SpringLayout.NORTH, p1);

        // Optional: Stretch p1 to fit content
        layout1.putConstraint(SpringLayout.EAST, p1, 5, SpringLayout.EAST, t1);
        layout1.putConstraint(SpringLayout.SOUTH, p1, 5, SpringLayout.SOUTH, t1);

        p.add(p1);            // Add p1 to main center panel
        f.setVisible(true);   // Refresh frame
    }
}
