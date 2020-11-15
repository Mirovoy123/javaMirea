package part8.ex1;

import javax.swing.*;
import java.awt.*;

public class Ex1 extends JFrame {
    public void paint(Graphics g) {
        for (int i = 0; i < 20; i++) {
            switch ((int) (Math.random() * 3)) {
                case 0: {
                    Shape o = new Line();
                    o.paintF(g);
                    break;
                }
                case 1: {
                    Shape o = new Rectangle();
                    o.paintF(g);
                    break;
                }
                case 2: {
                    Shape o = new Circle();
                    o.paintF(g);
                    break;
                }
            }
        }
    }
}