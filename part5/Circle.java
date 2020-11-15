package part5;

import part4.Shape;

public class Circle extends Shape {
    @Override
    public double getArea() {
        return this.radius*this.radius*3.14;
    }

    @Override
    public double getPerimeter() {
        return this.radius*2*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected double radius;

}
