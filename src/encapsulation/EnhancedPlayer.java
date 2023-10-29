package encapsulation;

public class EnhancedPlayer {
    private String fullName; // Rename
    private int health;
    private  String waepon;

// This makes sure that all required fields are initialized properly.
    public EnhancedPlayer(String name, int health, String waepon) {
        this.fullName = name;
        // Additional logics & vaidation can be done.
        if (health < 0) {
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.waepon = waepon;
    }
}
