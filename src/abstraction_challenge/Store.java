package abstraction_challenge;

import java.util.ArrayList;


record  OrderItem(int qty, ProductForSale product) {

}
public class Store {
    private ArrayList<ProductForSale> productForSales;

    public boolean addItemToOrder(ProductItem item) {
    return true;
    }


    public static void main(String[] args) {
        ArrayList<ProductForSale> products = new ArrayList<>();

        products.add(new ArtObject("Oil Paiting", 12.0, "This is cool Oil Paiting"));
        products.add(new ArtObject("Sculpture", 102.0, "This is sculpture"));
        
        printProducts(products);
    }

    private static void printProducts(ArrayList<ProductForSale> products) {
        for (ProductForSale product : products) {
            System.out.println("-".repeat(50));
            product.showDetails();
        }
    }
}
