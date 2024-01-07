public class Milk extends ProductForSale{
    public Milk(String type, double price, String description) {
        super(type, price, description);
    }
    @Override
    protected void showDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Milk {" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
