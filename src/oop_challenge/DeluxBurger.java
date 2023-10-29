package oop_challenge;

public class DeluxBurger extends Burger {
    private Item deluxe1;
    private Item deluxe2;

    public DeluxBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        this.deluxe1 = new Item(extra4, 0, "TOPPINGS");
        this.deluxe2 = new Item(extra5, 0, "TOPPINGS");
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }

    public void printItemizedList() {
        super.printItemizedList();
        if (deluxe1 != null) {
            deluxe1.printItem();
        }
       if (deluxe2 != null) {
           deluxe2.printItem();
       }
    }
}
