package part8.practice.test4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test4 extends JFrame {
    private JButton regB;
    private JButton customB;

    public Test4(){
        super("окно");
        setLayout(new FlowLayout());

        regB = new JButton("Кнопка");
        add(regB);

        Icon billy = new ImageIcon(getClass().getResource("Screenshot_3.png"));
        Icon billyChips = new ImageIcon(getClass().getResource("Screenshot_2.png"));

        customB = new JButton("КнопОчка", billy);
        customB.setRolloverIcon(billyChips);
        add(customB);
        Handling handler = new Handling();

        regB.addActionListener(handler);
        customB.addActionListener(handler);
        customB.setToolTipText("я тоже");
    }
    private class Handling implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,String.format("%s",e.getActionCommand()));
        }
    }
}
