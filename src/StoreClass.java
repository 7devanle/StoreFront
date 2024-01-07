import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StoreClass {
    private static List<ProductForSale> marketItems = new ArrayList<>();
    static ProductForSale cowbell = new Milk("Cowbell", 23.5, "Milk from cowbell, sturdy and refreshing");
    static ProductForSale dana = new Milk("Dana", 20.0, "Milk from Dana company, sturdy but less refreshing");
    static ProductForSale tilapia = new Fish("Tilapia", 13.5, "Tilapia straight from the sea, delicious and expensive");
    static ProductForSale panla = new Fish("Panla", 3.5, "dried fish, cheaper and less delicious");
    static ProductForSale corn = new Corn("Sweet Corn", 1.2, "Corn straight from farm, 1.2 pounds per piece, sweet corn, for beans and many other");


    public static void main(String[] args) {
        marketItems.addAll(List.of(cowbell, dana, tilapia, panla, corn));

    }

    public static void displayStoreItems(){
        int i = 1;
        for(ProductForSale product : marketItems){
            System.out.println(i + " "+ product );
        }
    }

    static String orderItem(String type){

        return "Item not avaialble";
    }

    public static String addToStore(String product, String type, double price, String description){
        ProductForSale newProduct;
        switch (product){
            case "fish" -> newProduct = new Fish(type, price,description);
            case "corn" ->  newProduct = new Corn(type, price,description);
            default -> newProduct = new Milk(type, price,description);
        }

        marketItems.add(newProduct);
        return newProduct.type+"added to store";
    }
}