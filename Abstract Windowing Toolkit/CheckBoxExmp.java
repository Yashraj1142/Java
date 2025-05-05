import java.awt.*;
import java.awt.event.*;

public class CheckBoxExmp extends Frame{
    Label l1, l2;
    CheckboxGroup chgrp;
    Checkbox c1, c2, c3, c4;

    CheckBoxExmp(){
        setLayout(null);

        l1 = new Label("Gender");
        l1.setBounds(30,50,60,50);

        l2 = new Label("Items");
        l2.setBounds(30,150,60,50);

        chgrp = new CheckboxGroup();
        c1 = new Checkbox("Male", chgrp, true);
        c2 = new Checkbox("Female", chgrp, false);

        c1.setBounds(110,50,60,50);
        c2.setBounds(170, 50,60,50);

        c3 = new Checkbox("Pen");
        c4 = new Checkbox("Book");

        c3.setBounds(110,150,60,50);
        c4.setBounds(170, 150,60,50);

        add(l1);
        add(l2);
        add(c1);
        add(c2);
        add(c3);
        add(c4);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        CheckBoxExmp demo = new CheckBoxExmp();

        demo.setTitle("Checkbox Example");
        demo.setSize(300,300);
        demo.setVisible(true);
    }
}
