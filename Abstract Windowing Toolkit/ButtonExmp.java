import java.awt.*;
import java.awt.event.*;

public class ButtonExmp extends Frame{
    //declaring button as instance variable
    Button btn;

    ButtonExmp(){
        //set the layout to null to manually set components
        setLayout(null);

        //Creating a button with label "Button"
        btn = new Button("Button");

        //Setting the position and size of the button
        btn.setBounds(100, 130, 100, 40);

        //adding the button to the frame
        add(btn);

        //Adding a window listener to handle the close event
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        //Creating an object of the frame
        ButtonExmp demo = new ButtonExmp();

        demo.setTitle("Example of Button");
        demo.setSize(300,300);
        demo.setVisible(true);
    }
}
