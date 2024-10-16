public class FoodProduct extends Product{

    private String bestBeforeDate;

    public FoodProduct(String name, Double price, String date) {
        super(name, price);

        this.bestBeforeDate = date;
    }
}
