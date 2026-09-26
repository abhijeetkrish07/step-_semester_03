public class GameCharacter {

    // Cannot be accessed directly from outside
    private int health;

    // Fixed after the object is created
    private final int maxHealth;

    // Constructor
    public GameCharacter(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    // Reduce health, but never below 0
    public void takeDamage(int amount) {
        health = health - amount;

        if (health < 0) {
            health = 0;
        }
    }

    // Increase health, but never above maxHealth
    public void heal(int amount) {
        health = health + amount;

        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    // Read-only access to health
    public int getHealth() {
        return health;
    }

    public static void main(String[] args) {

        GameCharacter c = new GameCharacter(100);

        c.takeDamage(30);
        System.out.println("After 30 damage: " + c.getHealth());

        c.heal(50);
        System.out.println("After healing 50: " + c.getHealth());

        c.takeDamage(150);
        System.out.println("After 150 damage: " + c.getHealth());
    }
}
