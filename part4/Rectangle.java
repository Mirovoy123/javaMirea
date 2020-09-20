package part4;

public class Rectangle extends Shape {
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        this.length = 10;
        this.width = 5;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    protected double length;
    protected double width;

    @Override
    public double getPerimeter() {
        return 2 * (this.length * this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
