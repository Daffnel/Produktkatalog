public class Product {

    private String name;
    private double price;

    public Product(String name, Double price) {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
