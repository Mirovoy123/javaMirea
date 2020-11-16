package part9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    JButton b;
    boolean isClicked = false;
    public GUI(){
        setLayout(new FlowLayout());
        JButton b = new JButton("Не нажимай меня!");
        b.setToolTipText("Не смей!!!");
        Handling handler = new Handling(this);
        b.addActionListener(handler);
        add(b);
    }
    public void paint(Graphics g) {
        if (isClicked){
            for (int i = 0; i < 20; i++) {
                switch ((int) (Math.random() * 3)) {
                    case 0: {
                        part9.Shape o = new Line();
                        o.draw(g);
                        break;
                    }
                    case 1: {
                        part9.Shape o = new Rectangle();
                        o.draw(g);
                        break;
                    }
                    case 2: {
                        Shape o = new Circle();
                        o.draw(g);
                        break;
                    }
                }
            }
        }
    }
    private class Handling implements ActionListener{
        GUI window;
        public Handling(GUI window){
            this.window = window;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            isClicked = true;
            window.paint(window.getGraphics());
        }
    }
}