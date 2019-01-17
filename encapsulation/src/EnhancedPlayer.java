public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, String weapon) {
        this.name = name;
        this.health = 100;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void damagePlayer(int damage) {
        if (this.health - damage <= 0) {
            System.out.println("You have been killed");
            this.health -= damage;
        } else {
            this.health -= damage;
            System.out.println("You have been hit with " + damage + "dmg");
            System.out.println("Your HP: " + this.health);
        }
    }
}
