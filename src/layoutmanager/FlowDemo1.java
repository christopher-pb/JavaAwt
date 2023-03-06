package layoutmanager;


import java.awt.*;
import javax.swing.*;

public class FlowDemo1{
    Frame frame1;
    FlowDemo1(){
        frame1=new Frame();

        Button box1=new Button("1");
        Button box2=new Button("2");
        Button box3=new Button("3");
        Button box4=new Button("4");
        Button box5=new Button("5");
        Button box6=new Button("6");
        Button box7=new Button("7");
        Button box8=new Button("8");
        Button box9=new Button("9");
        Button box10=new Button("10");

        frame1.add(box1);
        frame1.add(box2);
        frame1.add(box3);
        frame1.add(box4);
        frame1.add(box5);
        frame1.add(box6);
        frame1.add(box7);
        frame1.add(box8);
        frame1.add(box9);
        frame1.add(box10);
        frame1.setLayout(new FlowLayout(FlowLayout.CENTER));

        frame1.setSize(400,400);
        frame1.setVisible(true);
    }
    public static void main(String[] args) {
        new FlowDemo1();
    }
}
