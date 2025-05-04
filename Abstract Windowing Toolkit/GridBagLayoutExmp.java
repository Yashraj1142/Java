import java.awt.*;
import java.awt.event.*;

// Frame class using GridBagLayout
class DemoGridBag extends Frame {
    DemoGridBag() {
        // Creating labels, text field, text area, and button
        Label lbl1 = new Label("Enter your name: ");
        TextField t1 = new TextField(10);
        Label lbl2 = new Label("Provide comments: ");
        TextArea t2 = new TextArea(6, 15);
        Button btn1 = new Button("Enter");

        // Setting layout as GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gridbg = new GridBagConstraints();

        // Adding components with specified grid positions and sizes
        add(lbl1, gridbg, 0, 0, 1, 1, 0, 0);   // Label at (0,0)
        add(t1, gridbg, 1, 0, 1, 1, 0, 20);    // TextField at (1,0)
        add(lbl2, gridbg, 0, 1, 1, 1, 0, 0);   // Label at (0,1)
        add(t2, gridbg, 1, 1, 1, 1, 0, 60);    // TextArea at (1,1)
        add(btn1, gridbg, 0, 2, 2, 1, 0, 20);  // Button across (0,2) to (1,2)

        // Add window listener to close the window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Exit application on window close
            }
        });
    }

    // Custom add method to place component using GridBagConstraints
    void add(Component c, GridBagConstraints gridbg, int x, int y, int w, int h, int wx, int wy) {
        gridbg.gridx = x;        // Column position
        gridbg.gridy = y;        // Row position
        gridbg.gridwidth = w;    // Number of columns to span
        gridbg.gridheight = h;   // Number of rows to span
        gridbg.weightx = wx;     // Horizontal expansion weight
        gridbg.weighty = wy;     // Vertical expansion weight
        super.add(c, gridbg);    // Actually add component to the frame
    }
}

// Main class to run the application
public class GridBagLayoutExmp {
    public static void main(String[] args) {
        DemoGridBag demo = new DemoGridBag();  // Create the GUI frame
        demo.setTitle("Example of Grid Bag Layout"); // Set frame title
        demo.setSize(300, 200);    // Set frame size
        demo.setVisible(true);     // Show the frame
    }
}
