package layoutmanager;


import java.awt.*;
import javax.swing.*;

public class BoxDemo2 extends Frame {
    Button buttonBox[];
    public BoxDemo2 ()
    {
        buttonBox = new Button [10];
        for (int i = 0;i<8;i++)
        {
            buttonBox[i] = new Button ("** Button " + (i + 1)+" **");
            add (buttonBox[i]);
        }
        setLayout (new BoxLayout (this, BoxLayout.X_AXIS));
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String args[])
    {
        BoxDemo2 obj=new BoxDemo2();
    }
}
