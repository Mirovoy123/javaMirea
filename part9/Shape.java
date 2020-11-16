package part9;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JFrame {
    private Color color;
    private int x, y;

    public Shape(){
        setColor();
        setX();
        setY();
    }

    public Color getColor() {
        return color;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX() {
        this.x = (int)(Math.random() * 700);
    }

    public void setY() {
        this.y = (int)(Math.random() * 600);
    }

    public void setColor() {
        color = new Color ((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));
    }

    public abstract void draw(Graphics g);
}
