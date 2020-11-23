package part8.practice.test3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test3 extends JFrame {
    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
    private JPasswordField pass;
    public Test3(){
        super("TEST3");
        setLayout(new FlowLayout());

        field1 = new JTextField(10);
        add(field1);
        field2 = new JTextField("Maybe a little oil?");
        field2.setToolTipText("Two fat cocks?");
        add(field2);
        field3 = new JTextField("Can't touch this",20);
        field3.setEditable(false);
        add(field3);
        pass = new JPasswordField("0000");
        add(pass);

        Handling handler = new Handling();
        field1.addActionListener(handler);
        field2.addActionListener(handler);
        field3.addActionListener(handler);
        pass.addActionListener(handler);


    }
    private class Handling implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String string = "";
            if (e.getSource() == field1)
                string = String.format("Field one: %s",e.getActionCommand());
            else if (e.getSource() == field2)
                string = String.format("Field two: %s",e.getActionCommand());
            else if (e.getSource() == field3)
                string = String.format("Field three: %s",e.getActionCommand());
            else if (e.getSource() == pass)
                string = String.format("Password field: %s",e.getActionCommand());
            JOptionPane.showMessageDialog(null, string);
        }
    }

}
