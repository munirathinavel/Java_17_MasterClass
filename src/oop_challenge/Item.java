package oop_challenge;

public class Item {
    private String name;
    private double price;
    private String size;
    private String type;

    public Item(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.size = "Medium";
        this.type = type;
    }

    public double getBasePrice() {
        return price;
    }
    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "BIG" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public String getName() {
        return name;
    }

    public void printItem() {
        System.out.printf("%n%20s %6f", getName(), getAdjustedPrice());
    }
    public static void printItem(String name, double price) {
        System.out.printf("%n%20s %6f", name, price);
    }

    public void setSize(String size) {
        this.size = size;
    }
}
