package Interface;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class InterfaceTest {

    @Test
    void testInterfacExample() {

        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney TownHall", IconType.RED_STAR));
        mappables.add(new Building("Majestic Mall", IconType.GREEN_DOTTED));

        mappables.forEach(mappable -> );
    }
}