package encapsulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void loseHealth() {
        Player player = new Player();
        player.health = 100;  // Additional Logic & validation cannot be done here.
        player.name = "Vel"; // Name change would cause the caller to change
        player.weapon = "Spear"; // Does not make sure that all required fields are initialized.

        player.loseHealth(20);
        System.out.println("Remaining Health is : " + player.getRemainingHealth());

        player.loseHealth(100);
        System.out.println("Remaining Health is : " + player.getRemainingHealth());

    }
}