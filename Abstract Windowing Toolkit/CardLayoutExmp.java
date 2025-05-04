import java.awt.*;            // For AWT components and layouts
import java.awt.event.*;      // For event handling

// DemoCardLayout class extends Frame and implements ActionListener for button clicks
class DemoCardLayout extends Frame implements ActionListener {
    
    // Create a CardLayout with 20px horizontal and vertical gaps
    CardLayout c = new CardLayout(20, 20);

    DemoCardLayout() {
        // Set layout of the Frame to CardLayout
        setLayout(c);

        // Create three buttons (each acts like a "card")
        Button btn1 = new Button("The first button");
        Button btn2 = new Button("The second button");
        Button btn3 = new Button("The third button");

        // Add buttons to the frame with unique card names
        add(btn1, "Card 1");
        add(btn2, "Card 2");
        add(btn3, "Card 3");

        // Add action listener to all buttons
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        // Handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);   // Exit the program when window is closed
            }
        });
    }

    // When any button is clicked, show the next card
    public void actionPerformed(ActionEvent e) {
        c.next(this);   // Show the next component/card in the layout
    }
}

// Main class to run the application
public class CardLayoutExmp {
    public static void main(String[] args) {
        // Create an instance of DemoCardLayout
        DemoCardLayout demo = new DemoCardLayout();

        // Set frame title, size, and visibility
        demo.setTitle("A demo of card layout");
        demo.setSize(440, 300);
        demo.setResizable(false);
        demo.setVisible(true);
    }
}
