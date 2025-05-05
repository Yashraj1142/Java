import java.awt.*;
import java.awt.event.*;

public class TextAreaExmp extends Frame{
    TextArea t1;

    TextAreaExmp(){
        setLayout(null);
        
        t1 = new TextArea(2,20);
        t1.setBounds(50,50,200,100);

        add(t1);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        TextAreaExmp demo = new TextAreaExmp();

        demo.setTitle("Text Area Example");
        demo.setSize(300,300);
        demo.setVisible(true);
    }
}
