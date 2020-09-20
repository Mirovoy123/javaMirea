package part4;

public class Square extends Rectangle {
    public Square() {
        this.length = 5;
        this.width = 5;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + length +
                '}';
    }
}
