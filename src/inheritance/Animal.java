package inheritance;

public class Animal {
    protected String type;
    final private String size;

    private int weight;

    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println("Animal " + type + " moves " + speed);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
