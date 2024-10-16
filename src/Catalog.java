import java.util.ArrayList;

public class Catalog {
    private final ArrayList<Product> allProducts;


    public Catalog() {

        this.allProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        allProducts.add(product);
        System.out.println(product + " was added to the catalog.");
    }

    public void printAllProducts() {
        System.out.println("Foods: ");
        for (Product product : allProducts) {
            if (product instanceof FoodProduct) {
                System.out.println(product);
            }
        }
        System.out.println("Electronics: ");
        for (Product product : allProducts) {
            if (product instanceof ElectronicProduct) {
                System.out.println(product);
            }
        }
    }

    public void printFoodProducts() {
        System.out.println("Foods:");
        for (Product product : allProducts) {
            if (product instanceof FoodProduct) {
                System.out.println(product);
            }
        }
    }

    public void printElectronicProducts() {
        System.out.println("Electronics:");
        for (Product product : allProducts) {
            if (product instanceof ElectronicProduct) {
                System.out.println(product);
            }
        }
    }
}
