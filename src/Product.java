public class Product {

    private String name;
    private double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price + ":-";
    }
}
