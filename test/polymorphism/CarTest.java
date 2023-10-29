package polymorphism;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void runEngine() {
        Car gas = Car.getCar("This is Gas Car", 12.0, 12, 0, "Gas");
        gas.startEngine();
        gas.drive();
        gas.runEngine();
        System.out.println("------------");
    }
}