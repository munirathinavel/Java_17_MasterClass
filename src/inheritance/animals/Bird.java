package inheritance.animals;

public class Bird extends Animal implements Flyable, Trackable{
    public Bird(String type, double weight) {
        super(type, weight);
    }

    @Override
    public void fly() {
        System.out.printf("%s is flying with weight %s%n", type, weight);
    }

    @Override
    public void takeoff() {
        System.out.println(type + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(type + " is landing");
    }

    @Override
    public void track() {
        System.out.printf("%s is being tracked with weight %s%n", type, weight);
    }
}
