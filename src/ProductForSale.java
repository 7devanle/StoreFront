public abstract class ProductForSale {
    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    protected String type;
    protected double price;
    protected String description;

    protected void printPricedItem(int quantity){
        OrderItem i = new OrderItem(quantity, this);
        System.out.println(i);
    }
    protected double getSalesPrice(int quantity){
        return this.price*quantity;
    }
    protected abstract void showDetails();
}
