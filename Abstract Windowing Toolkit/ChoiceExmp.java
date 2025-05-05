import java.awt.*;
import java.awt.event.*;

public class ChoiceExmp extends Frame{
    Label l1;
    Choice c1;

    ChoiceExmp(){
        setLayout(null);

        l1 = new Label("Country");
        l1.setBounds(30,50,90,90);

        c1 = new Choice();
        c1.add("India");
        c1.add("Australia");
        c1.add("Britain");
        c1.add("USA");
        c1.setBounds(150,90,90,90);

        add(l1);
        add(c1);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        ChoiceExmp demo = new ChoiceExmp();

        demo.setSize(300,300);
        demo.setTitle("Choice example");
        demo.setVisible(true);
    }
}
