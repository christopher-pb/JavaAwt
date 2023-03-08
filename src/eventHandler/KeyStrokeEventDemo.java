package eventHandler;

import java.awt.*;
import java.awt.event.*;

public class KeyStrokeEventDemo implements KeyListener {

    Frame frame = new Frame();
    TextField txtFld = new TextField(25);
Label lbl =new Label();
    KeyStrokeEventDemo() {
        lbl.setBounds(20,50,100,20);
        txtFld.setBounds(20,80,300,300);
        txtFld.addKeyListener(this);

        frame.add(lbl);
        frame.add(txtFld);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);




    }

    public void keyPressed(KeyEvent e) {
        lbl.setText("key Pressed"  );
    }

    public void keyReleased(KeyEvent e) {
        // some code here
        lbl.setText("Key Released"  );

    }

    public void keyTyped(KeyEvent e) {
        // provide an implementation here
        lbl.setText("Key Typed" );
    }

    public static void main(String args[]) {

        KeyStrokeEventDemo PressKey = new KeyStrokeEventDemo();

    }
}