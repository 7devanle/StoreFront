import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class StoreClass {
    private static List<ProductForSale> marketItems = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static ProductForSale cowbell = new Milk("Cowbell", 23.5, "Milk from cowbell, sturdy and refreshing");
    static ProductForSale dana = new Milk("Dana", 20.0, "Milk from Dana company, sturdy but less refreshing");
    static ProductForSale tilapia = new Fish("Tilapia", 13.5, "Tilapia straight from the sea, delicious and expensive");
    static ProductForSale panla = new Fish("Panla", 3.5, "dried fish, cheaper and less delicious");
    static ProductForSale corn = new Corn("Sweet Corn", 1.2, "Corn straight from farm, 1.2 pounds per piece, sweet corn, for beans and many other");


    public static void main(String[] args) {
        marketItems.addAll(List.of(cowbell, dana, tilapia, panla, corn));
        displayStoreItems();
        orderItem();
    }

    public static void displayStoreItems(){
        int i = 1;
        for(ProductForSale product : marketItems){
            System.out.println(i + " "+ product );
            i++;
        }
    }

    static void orderItem(){
        List<ProductForSale> orders = new ArrayList<>();
        boolean shopping = true;
        while(shopping){
            System.out.println("Enter 0 to quit");
            for(int i = 0; i<marketItems.size(); i++){
                System.out.println("Enter "+(i+1)+" to order "+marketItems.get(i));
            }
            int input = scanner.nextInt();
            if(input == 0){
                shopping = false;
                System.out.println("Done shopping");
            }
            else {
                System.out.println(marketItems.get(input - 1));
                orders.add(marketItems.get(input-1));
            }
        }
        System.out.println(orders);
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