import java.awt.*;
import java.awt.event.*;

public class MenuExmp extends Frame{
    MenuBar mbar;
    Menu m;
    Menu subm;

    MenuExmp(){
        setLayout(null);

        mbar = new MenuBar();
        m = new Menu("Menu");
        subm = new Menu("Sub Menu");

        MenuItem i1 = new MenuItem("Item 1");
        MenuItem i2 = new MenuItem("Item 2");
        MenuItem i3 = new MenuItem("Item 3");
        MenuItem i4 = new MenuItem("Item 4");
        MenuItem i5 = new MenuItem("Item 5");
        MenuItem i6 = new MenuItem("Item 6");

        setMenuBar(mbar);
        mbar.add(m);
        m.add(i1);
        m.add(i2);
        m.add(i3);
        m.add(i4);
        m.add(subm);
        subm.add(i5);
        subm.add(i6);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MenuExmp demo = new MenuExmp();

        demo.setSize(300,300);
        demo.setTitle("Example of menu");
        demo.setVisible(true);
    }
}