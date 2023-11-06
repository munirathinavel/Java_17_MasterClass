package abstraction_challenge;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public void printPricedItem(int qty) {
        System.out.println(type + " of" + qty + " is " + (qty * price));
    }

    public double getSalesPrice(int qty) {
        return qty * price;
    }

    public abstract void showDetails();
}
