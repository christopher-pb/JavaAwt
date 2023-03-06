package layoutmanager;

import java.awt.*;


public class BorderDemo1
{
    Frame frame;
    BorderDemo1()
    {
        frame=new Frame();
        BorderLayout layout = new BorderLayout();
        layout.setHgap(10);
        layout.setVgap(10);


        Button box1=new Button("**NORTH**");;
        Button box2=new Button("**SOUTH**");;
        Button box3=new Button("**EAST**");;
        Button box4=new Button("**WEST**");;
        Button box5=new Button("**CENTER**");;
        frame.setLayout(layout);
        frame.setBackground(Color.CYAN);
        frame.add(box1,BorderLayout.NORTH);
        frame.add(box2,BorderLayout.SOUTH);
        frame.add(box3,BorderLayout.EAST);
        frame.add(box4,BorderLayout.WEST);
        frame.add(box5,BorderLayout.CENTER);

        frame.setSize(400,400);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new BorderDemo1();
    }
}
