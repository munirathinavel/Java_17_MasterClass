package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchNATOTest {

    @Test
    void printNATO() {
        SwitchNATO switchNATO = new SwitchNATO();

        System.out.println(switchNATO.printNATO('C'));
        System.out.println(switchNATO.printNATO('A'));
        System.out.println(switchNATO.printNATO('R'));
    }
}