package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooserDemo extends JFrame implements ActionListener {

    JButton b;
    Container c;
    JColorChooserDemo(){
        c=getContentPane();
        c.setLayout(new FlowLayout());
        b=new JButton("color");
        b.addActionListener(this);
        c.add(b);
    }
    public void actionPerformed(ActionEvent e) {
        Color initialcolor=Color.RED;
        Color color= JColorChooser.showDialog(this, "Select a color", initialcolor);
        c.setBackground(color);
    }



    public static void main(String[] args) {
        JColorChooserDemo ch=new JColorChooserDemo();
        ch.setSize(400,400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}