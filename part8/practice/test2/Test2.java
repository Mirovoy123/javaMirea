package part8.practice.test2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test2 extends JFrame{
    private JLabel text1;

    public Test2(){
        super("TEST2");
        setLayout(new FlowLayout());
        text1 = new JLabel("FUCKING SLAVES");
        text1.setToolTipText("GET YOUR ASS BACK HERE");
        add(text1);
    }
}
