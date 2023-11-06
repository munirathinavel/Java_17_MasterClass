package abstraction;

import java.util.ArrayList;

abstract class Animal {
    protected String type;
    private String name;
    private int weight;

    public Animal(String type, String name, int weight) {
        this.type = type;
        this.name = name;
        this.weight = weight;
    }

    public abstract void move(String speed);

    protected abstract void makeNoise();

    public final String getExplicitType() {
        return this.getClass().getSimpleName() + "(" + type + ")";
    }
}

abstract  class Mammal extends Animal{
    public Mammal(String type, String name, int weight) {
        super(type, name, weight);
    }

    abstract void feeding();

    @Override
    public void move(String speed) {
        System.out.println(type + " moves" + speed);
    }
}

class Cat extends Mammal {

    public Cat(String type, String name, int weight) {
        super(type, name, weight);
    }

    @Override
    void feeding() {
        System.out.println(type + " is feeding kitties");
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + " is walking");
        } else {
            System.out.println(getExplicitType() + " is claiming");
        }

    }

    @Override
    protected void makeNoise() {
        if (type == "puppy") {
            System.out.println("Meow Meow!");
        } else {
            System.out.println("Meeeoww!!");
        }
    }
}
class Dog extends Mammal {

    public Dog(String type, String name, int wieght) {
        super(type, name, wieght);
    }

    @Override
    void feeding() {
        System.out.println(type + " is feeding puppies.");
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + " is walking");
        } else {
            System.out.println(getExplicitType() + " is running");
        }

    }

    @Override
    protected void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Howling!");
        } else {
            System.out.println("Woof");
        }

    }

}
public class AbstractClass {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Animal dog = new Dog("Wolf", "Ramu", 23);
        animals.add(dog);
        Animal cat = new Cat("Cat", "Kitty", 10);
        animals.add(cat);

        for(Animal animal: animals) {
            doAnimalStuffs(animal, "fast");

            if (animal instanceof Mammal mammal) {
                mammal.feeding();
            }
            System.out.println("-".repeat(50));
        }


    }

    private  static void  doAnimalStuffs(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
    }
}
