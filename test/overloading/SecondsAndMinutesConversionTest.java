package overloading;

import oops.inheritance.methodoverloading.SecondsAndMinutesConversion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondsAndMinutesConversionTest {

    @Test
    void secondsAndMinutes() {
        SecondsAndMinutesConversion conversion = new SecondsAndMinutesConversion();
        assertEquals("8h 23m 20s", conversion.secondsAndMinutes(30200));
        assertEquals("1h 3m 20s", conversion.secondsAndMinutes(3800));
        assertEquals("0h 3m 20s", conversion.secondsAndMinutes(200));
        assertEquals("0h 0m 20s", conversion.secondsAndMinutes(20));
        assertEquals("0h 0m 0s", conversion.secondsAndMinutes(0));
        assertEquals("Invalid input", conversion.secondsAndMinutes(-12));

    }

    @Test
    void testSecondsAndMinutes() {
        SecondsAndMinutesConversion conversion = new SecondsAndMinutesConversion();
        assertEquals("6h 20m 20s", conversion.secondsAndMinutes(380, 20));
        assertEquals("0h 30m 25s", conversion.secondsAndMinutes(30, 25));
        assertEquals("0h 20m 20s", conversion.secondsAndMinutes(20, 20));
        assertEquals("0h 0m 0s", conversion.secondsAndMinutes(0));
        assertEquals("Invalid input", conversion.secondsAndMinutes(-12, -4));
        assertEquals("Invalid input", conversion.secondsAndMinutes(1, 324234));
    }
}