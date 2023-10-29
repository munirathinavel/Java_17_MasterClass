package oop_challenge;

public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super(name, price, "Burger");
    }

    @Override
    public String getName() {
        return super.getName() + " Burger";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice()
                + (extra1 != null ? extra1.getAdjustedPrice() : 0)
                + (extra2 != null ? extra2.getAdjustedPrice() : 0)
                + (extra3 != null ? extra3.getAdjustedPrice() : 0);
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item(extra1, getExtraPrice(extra1), "TOPPING" );
        this.extra2 = new Item(extra2, getExtraPrice(extra1), "TOPPING" );
        this.extra3 = new Item(extra3, getExtraPrice(extra1), "TOPPING" );
    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.5;
        };
    }

    public void printItemizedList() {
        Item.printItem(getName(), getBasePrice());
        extra1.printItem();
        extra2.printItem();
        extra3.printItem();
    }
}
