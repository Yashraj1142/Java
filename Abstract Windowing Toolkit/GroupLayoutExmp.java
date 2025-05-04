import javax.swing.*;

public class GroupLayoutExmp {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame1 = new JFrame();
        JPanel panel1 = new JPanel();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on X button

        // Create GroupLayout and set it to the panel
        GroupLayout layout1 = new GroupLayout(panel1);
        panel1.setLayout(layout1);

        // Create buttons
        JButton btn1 = new JButton("A");
        JButton btn2 = new JButton("B");
        JButton btn3 = new JButton("C");
        JButton btn4 = new JButton("D");
        JButton btn5 = new JButton("E");

        // Horizontal group - defines left-to-right layout
        GroupLayout.SequentialGroup left = layout1.createSequentialGroup(); // Sequential: one after another

        left.addComponent(btn1); // Add button A

        // Create a parallel group (middle column)
        GroupLayout.ParallelGroup cMiddle = layout1.createParallelGroup(); // Parallel: stacked vertically
        cMiddle.addComponent(btn2); // Add button B
        cMiddle.addComponent(btn4); // Add button D
        cMiddle.addComponent(btn5); // Add button E

        left.addGroup(cMiddle); // Add the vertical group to the sequence

        left.addComponent(btn3); // Add button C

        // Vertical group - defines top-to-bottom layout
        GroupLayout.SequentialGroup top = layout1.createSequentialGroup(); // Top-down arrangement

        // Create a row of components in parallel (row: A, B, C)
        GroupLayout.ParallelGroup rowTop = layout1.createParallelGroup();
        rowTop.addComponent(btn1);
        rowTop.addComponent(btn2);
        rowTop.addComponent(btn3);

        top.addGroup(rowTop); // Add the top row
        top.addComponent(btn4); // Add D below the row
        top.addComponent(btn5); // Add E below D

        // Set horizontal and vertical groups to the layout
        layout1.setHorizontalGroup(left);
        layout1.setVerticalGroup(top);

        // Add the panel to the frame
        frame1.add(panel1);
        frame1.pack(); // Adjusts frame size to fit components
        frame1.setVisible(true); // Show the frame
    }
}
