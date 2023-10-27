package overloading;


import oops.inheritance.methodoverloading.MethodOverloading;
import org.junit.jupiter.api.Test;

class MethodOverloadingTest {


    @Test
    void testMethod() {

        MethodOverloading overloading = new MethodOverloading();
        overloading.method();
        overloading.method(1245);
        overloading.method(12.0f);
        overloading.method(12, 12.0f);
        overloading.method(12.0f, 12);
        overloading.method(12, 12, 12);
    }

}