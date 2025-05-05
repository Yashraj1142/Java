import java.awt.*;
import java.awt.event.*;

public class ListExmp extends Frame{
    List l1;
    ListExmp(){
        setLayout(null);

        l1 = new List();
        l1.setBounds(100,100,100,100);
        l1.add("Item 1");
        l1.add("Item 2");
        l1.add("Item 3");
        l1.add("Item 4");
        l1.add("Item 5");
        l1.add("Item 6");
        l1.add("Item 7");
        l1.add("Item 8");
        l1.add("Item 9");
        add(l1);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        ListExmp demo = new ListExmp();

        demo.setSize(300,300);
        demo.setTitle("Example of list");
        demo.setVisible(true);
    }
}
