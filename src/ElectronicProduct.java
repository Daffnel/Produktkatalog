public class ElectronicProduct {

    private String warrantyDate;

    public ElectronicProduct(String warrantyDate) {
        super();
        this.warrantyDate = warrantyDate;
    }


    @Override
    public String toString() {
        return "ElectronicProduct{" +
                "warrantyDate='" + warrantyDate + '\'' +
                '}';
    }
}
