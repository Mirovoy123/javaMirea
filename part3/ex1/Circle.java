package part3.ex1;

public class Circle {
    public final double PI = 3.14;
    private int radius;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getCirc() {
        return radius*2*PI;
    }

    public void setCirc(double Circ) {
        this.radius = (int)(Circ/(2*PI));
    }
    public int getDiameter() {
        return radius*2;
    }

    public void setDiameter(int diameter) {
        this.radius = diameter/2;
    }

    @Override
    public String toString() {
        return "Окружность радиусом " + getRadius() +
                ", длиной окружности " + getCirc() +
                "и цветом " + getColor() + ".";
    }
}
