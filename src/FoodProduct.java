public class FoodProduct extends Product{

    private String date;

    public FoodProduct(String name, Double price, String date) {
        super(name, price);

        this.date = date;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "date='" + date + '\'' +
                '}';
    }
}
