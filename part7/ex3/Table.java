package part7.ex3;

public class Table extends Furniture {
    private final int numberOfLegs;
    private final int price;
    private final String material;

    public Table(int numberOfLegs, int price, String material) {
        this.numberOfLegs = numberOfLegs;
        this.price = price;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Table{" +
                "numberOfLegs=" + numberOfLegs +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public void build() {
        System.out.println("hard");
    }
}
