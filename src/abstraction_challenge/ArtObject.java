package abstraction_challenge;

public class ArtObject extends ProductForSale{

    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Type:" + type + ", Price:" + price + ", Description:" + description);
    }
}
