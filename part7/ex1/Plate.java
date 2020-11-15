package part7.ex1;

import part7.ex1.Dish;

public class Plate extends Dish {
    public Plate(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    private final int radius;
    private final String color;

    @Override
    public void Break() {
        System.out.println("im unbreakable");
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
