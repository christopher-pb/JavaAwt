package Controls;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxDemo extends Frame {
    Checkbox c1, c2;
    CheckboxDemo()
    {
        setSize(400, 200);
        setTitle("My Application");
        setLayout(new FlowLayout());
        setVisible(true);
        c1 = new Checkbox("Male");
        c2 = new Checkbox("Female");
        add(c1);
        add(c2);

        addWindowListener(new WindowAdapter()
                          {
                              public void windowClosing(WindowEvent we)
                              {
                                  System.exit(0);
                              }
                          }
        );
    }
    public static void main(String[] args)
    {
        CheckboxDemo mf = new CheckboxDemo();
    }
}
