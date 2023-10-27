package oops.inheritance.constructoroverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorOverloadingTest {

    @Test
    public void constructorOverloading() {
        ConstructorOverloading overloading = new ConstructorOverloading();
        overloading.setEmail("vel@cool.com");
        overloading.setFirstName("Munirathinavel");
        overloading.setLastName("Chinnasamy");
        System.out.println("Employee Info:" + overloading);

        ConstructorOverloading overloading1 = new ConstructorOverloading("vel1@gmail.com");
        System.out.println(overloading1);

        ConstructorOverloading overloading2 = new ConstructorOverloading("CM", "Vel", "cool@gmail.com");
        System.out.println(overloading2);
    }

}