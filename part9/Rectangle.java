package part9;

import java.awt.*;

public class Rectangle extends Shape {
    private int length, width;

    public Rectangle() {
        setLength();
        setWidth();
    }

    public void setWidth() {
        this.width = (int)(Math.random() * 200);
    }
    public void setLength() {
        this.length = (int)(Math.random() * 200);
    }

    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }

    @Override
    public void draw(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setPaint(getColor());
        g.fillRect(getX(), getY(), getLength() , getWidth());
    }

}