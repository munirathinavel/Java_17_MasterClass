package inheritance.animals;

public abstract class Animal {
    protected String type;
    protected double weight;

    public Animal(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public abstract void fly();

    public void eat() {
        System.out.printf("%s is  eating with weight %s%n", type, weight);
    }

}


