package inheritance.animals;

import org.junit.jupiter.api.Test;

class AnimalTest {

    @Test
    void testAnimal() {
        System.out.println("-".repeat(75));
        Animal duck = new Bird("Duck", 12.0);
        duck.fly();
        duck.eat();
        if (duck instanceof  Bird trackable) {
            trackable.track();
        }
        System.out.println("-".repeat(75));

        Bird hen = new Bird("Hen", 3.75);
        hen.takeoff();
        hen.track();
        hen.fly();
        hen.getCurrentLocation();
        hen.land();
        hen.eat();
        System.out.println("-".repeat(75));

        Animal animal = hen;
        animal.eat();
        animal.fly();

        Flyable flyable = hen;
        flyable.takeoff();
        flyable.fly();
        flyable.land();

        Trackable trackable = hen;
        trackable.track();
        trackable.getCurrentLocation();
        System.out.println("-".repeat(75));

        Jet jet = new Jet();
        jet.takeoff();
        jet.fly();
        jet.getCurrentLocation();
        jet.track();
        jet.achieveOrbit();
        jet.land();
        Trackable.trackBlackListedCountries();
        System.out.printf("Deffault Location: %s %n", jet.getDefaultLocation());
        System.out.println("-".repeat(75));

        Trackable truck = new Truck();
        truck.track();
        truck.getCurrentLocation();
        System.out.println("-".repeat(75));

        System.out.println(100 * Flyable.KM_TO_MILE);

        System.out.println("-".repeat(75));

        OrbitEarth satellite = new Satellite();

        satellite.takeoff();
        satellite.fly();
        satellite.achieveOrbit();
        satellite.land();

        System.out.println("-".repeat(75));

    }
}