package swing;
import javax.swing.*;
public class JComboxDemo {

        JFrame frame;
    JComboxDemo(){
            frame = new JFrame("example");
            String courses[] = { "core java","advance java", "java servlet"};
            JComboBox c = new JComboBox(courses);
            c.setBounds(40,40,90,20);
            frame.add(c);
            frame.setSize(400,400);
            frame.setLayout(null);
            frame.setVisible(true);
        }
        public static void main(String args[])
        {
            new JComboxDemo();
        }

}
