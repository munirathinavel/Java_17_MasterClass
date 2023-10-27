package inheritance;

import org.junit.jupiter.api.Test;

class AnimalTest {

    @Test
    void testAnimal() {
        Animal generalAnimal = new Animal("Generic", "Big", 500);
        doAnimalStuffs(generalAnimal, "slow");

        Animal dog = new Dog("Johnny", 15);
        doAnimalStuffs(dog, "slow");

        Animal germanSheperd = new Dog("Ram", 30, "Stright", "Semi Circular");
        doAnimalStuffs(germanSheperd, "fast");

        Animal kitty = new Cat("Kitty", 4, 5);
        doAnimalStuffs(kitty, "fast");

        kitty.hashCode();

        String s = new String("A");
        String s1 = new String("A");
        String s2 = "A";
        String s3 = "A";
    }

    private static void doAnimalStuffs(Animal animal, String speed) {
        animal.move(speed);
        System.out.println(animal);
        System.out.println("---------------------");
    }
}