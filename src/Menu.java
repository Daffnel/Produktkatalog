
import java.util.Scanner;

public class Menu {
    final private Scanner scanner;
    final private Catalog catalog;

    public Menu(Catalog catalog) {
        this.scanner = new Scanner(System.in);
        this.catalog = catalog;
    }

    public void run(){
        while (true) {
            System.out.println("Welcome!");
            System.out.println("1. Add product");
            System.out.println("2. Print all catalogs");
            System.out.println("3. Exit");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("1")) {
                System.out.println("Enter name of product");
                String name = scanner.nextLine();
                double price;
                while (true) {
                    System.out.println("Enter price of product:");
                    if (scanner.hasNextDouble()) {
                        price = scanner.nextDouble();
                        scanner.nextLine();
                        break;
                    }
                    else{
                        System.out.println("Invalid price");
                    }
                }
                catalog.addProduct(new Product(name, price));
            }
            else if (input.equalsIgnoreCase("2")) {
                catalog.printAllProducts();
            }
            else if (input.equalsIgnoreCase("3")) {
                break;
            }
        }
    }


package PACKAGE_NAME;

public class Menu {

}
