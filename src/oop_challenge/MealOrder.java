package oop_challenge;

public class MealOrder {
    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder(String sideType, String drinkType, String  burgerType) {
        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxBurger("Deluxe", 10);
        }  else {
            this.burger = new Burger(burgerType, 4.0);
        }
        this.side = new Item("Side", 2.0, sideType);
        this.drink = new Item("Drink", 1.0, drinkType);
    }

    public void addBurgetToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgetToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if (burger instanceof DeluxBurger db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public double getTotalPrice() {
        if (burger instanceof DeluxBurger) {
         return burger.getAdjustedPrice();
        }
        return burger.getAdjustedPrice() + side.getAdjustedPrice() + drink.getAdjustedPrice();
    }

    public void printItemizedList() {
        System.out.printf("%25s %n","BILL SUMMARY");
        System.out.printf("-".repeat(30));

        burger.printItemizedList();
        System.out.printf("\n%s", "-".repeat(30));
        if (burger instanceof DeluxBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            side.printItem();
            drink.printItem();
        }
        System.out.println();
        System.out.printf("-".repeat(30));
        System.out.printf("\n%20s %6f" , "TOTAL PRICE", getTotalPrice());
        System.out.println();
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
