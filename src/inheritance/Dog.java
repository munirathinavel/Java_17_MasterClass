package inheritance;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(String type, int weight) {
        this(type, weight, "Elliptic", "Curly");
    }

    public Dog(String type, int weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : weight < 25 ? "Medium" : "Big", weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Ow! woooo");
        } else {
            System.out.println("Woof!");
        }
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("From Dog class");
        if (speed.equals("slow")) {
            walk();
            wagTail();
        } else {
            run();
            makeNoise();
        }
    }

    public void run() {
        System.out.println(type + " is running");
    }

    public void wagTail() {
        System.out.println(type + " is wagging Tail");
    }

    public void walk() {
        System.out.println(type + " is walking");
    }
}
