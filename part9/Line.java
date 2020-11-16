package part9;

import java.awt.*;

public class Line extends Shape {
    private int x2,y2;

    public Line() {
        setX2();
        setY2();
    }

    public void setX2() {
        this.x2 = (int)(Math.random() * 200);
    }
    public void setY2() {
        this.y2 = (int)(Math.random() * 200);
    }

    public int getX2() {
        return x2;
    }
    public int getY2() {
        return y2;
    }



    @Override
    public void draw(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setPaint(getColor());
        g.drawLine(getX(),getY(),getX2(),getY2());
    }

}