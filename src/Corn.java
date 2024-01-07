public class Corn extends ProductForSale{
    public Corn(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    protected void showDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Corn{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
