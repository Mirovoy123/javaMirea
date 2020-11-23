package part8.practice.test5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Test5 extends JFrame{
    private final JTextField textField;
    private final JCheckBox boldBox;
    private final JCheckBox italicBox;
    public Test5(){
        super("окошко");
        setLayout(new FlowLayout());
        textField= new JTextField("Lorem Ipsum",15);
        textField.setFont(new Font("serif",Font.PLAIN,48));
        boldBox = new JCheckBox("Поезд пассажирский");
        italicBox = new JCheckBox("Башня Пиза");
        add(textField);
        add(boldBox);
        add(italicBox);

        Handling handler = new Handling();
        boldBox.addItemListener(handler);
        italicBox.addItemListener(handler);
    }
    private class Handling implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font = null;
            if (boldBox.isSelected() && italicBox.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC,32);
            else if (boldBox.isSelected())
                font = new Font("Serif", Font.BOLD,32);
            else if (italicBox.isSelected())
                font = new Font("Serif", Font.ITALIC,32);
            textField.setFont(font);
        }
    }
}
