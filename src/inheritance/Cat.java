package inheritance;

public class Cat extends Animal {
    private int lines;

    public Cat(String type, int weight, int lines) {
        super(type, "small", weight);
        this.lines = lines;
    }

    public void claimTree() {
        System.out.println(type + " is claiming tree");
    }

    @Override
    public void move(String speed) {
        super.move(speed);

        if (speed.equals("slow")) {
            walk();
        } else {
            run();
            makeNoise();
        }
    }

    public void walk() {
        System.out.println(type + " is walking");
    }

    public void run() {
        System.out.println(type + " is running");
    }

    public void makeNoise() {
        System.out.println("Meow! meow!");
    }
}
