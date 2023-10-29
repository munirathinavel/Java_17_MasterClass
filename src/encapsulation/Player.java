package encapsulation;

public class Player {
    // High dependancy with caller.
    public String name; // Name change would cause the caller to change
    public int health; // Additional Logic & validation cannot be done here.
    public String weapon;

    public void loseHealth(int loss) {
        health = health - loss;

        if (health < 0) {
            health = 0;
        }
    }
    public int getRemainingHealth() {
        return health;
    }
}
