import java.util.ArrayList;

public class Catalog {
    private final ArrayList<Product> allProducts;




    public Catalog() {

            this.allProducts = new ArrayList<>();
        }

        public void addProduct (Product product){
            allProducts.add(product);
            System.out.println(product + " was added to the catalog.");
        }

        public void printAllProducts () {
            for (Product product : allProducts) {
                System.out.println(product);
            }
        }

        public ArrayList<Product> getAllProducts () {
            return allProducts;
        }
    }
