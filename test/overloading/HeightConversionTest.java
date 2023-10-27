package overloading;

import oops.inheritance.methodoverloading.HeightConversion;
import org.junit.jupiter.api.Test;

class HeightConversionTest {

    @Test
    void convertToCentimeters() {
        HeightConversion heightConversion = new HeightConversion();
        heightConversion.convertToCentimeters(61);
        heightConversion.convertToCentimeters(68);
    }

    @Test
    void testConvertToCentimeters() {
        HeightConversion heightConversion = new HeightConversion();
        heightConversion.convertToCentimeters(5, 1);
        heightConversion.convertToCentimeters(5, 8);
    }
}