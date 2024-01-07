public class Fish extends ProductForSale{
    public Fish(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    protected void showDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
