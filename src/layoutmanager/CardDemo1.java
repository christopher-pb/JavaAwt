package layoutmanager;


import java.awt.*;
import java.awt.event.*;

public class CardDemo1 extends Frame implements ActionListener
{
    CardLayout card = new CardLayout(20,20);
    CardDemo1()
    {
        setLayout(card);
        Button Btnfirst = new Button("first ");
        Button BtnSecond = new Button ("Second");
        Button BtnThird = new Button("Third");
        add(Btnfirst,"Card1");
        add(BtnSecond,"Card2");
        add(BtnThird,"Card3");
        Btnfirst.addActionListener(this);
        BtnSecond.addActionListener (this);
        BtnThird.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        card.next(this);
    }
    public static void main(String args[])
    {
        CardDemo1 frame = new CardDemo1();
        frame.setTitle("CardLayout in Java Example");
        frame.setSize(300,300);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
