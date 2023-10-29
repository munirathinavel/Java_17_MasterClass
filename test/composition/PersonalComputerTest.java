package composition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonalComputerTest {

    @Test
    void turnOn() {
        Dimension dimension = new Dimension(1,2,3);
        Monitor monitor = new Monitor("Super Cool", "LG", 12, 12, dimension);
        KeyBoard keyBoard = new KeyBoard("K122", "Dell");
        MotherBoard motherBoard = new MotherBoard("1124", "Asus", "Windows OS");
        PersonalComputer computer = new PersonalComputer("Latitude", "Dell", monitor, motherBoard, keyBoard);
        System.out.println(computer);
        computer.turnOn();

    }
}