package layoutmanager;


import java.awt.*;
import javax.swing.*;

public class BoxDemo1 extends Frame {
    Button buttonBox[];
    public BoxDemo1 ()
    {
        buttonBox = new Button [10];
        for (int i = 0;i<10;i++)
        {
            buttonBox[i] = new Button ("** Button " + (i + 1)+" **");
            add (buttonBox[i]);
        }
        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String args[])
    {
        BoxDemo1 obj=new BoxDemo1();
    }
}
