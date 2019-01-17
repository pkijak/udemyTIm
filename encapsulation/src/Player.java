public class Player {

    public String name;
    public int health = 100;
    public String weaopn;

    public void loseHealth(int damage) {
        if (this.health - damage <= 0) {
            System.out.println("You have been killed");
            this.health -= damage;
        } else {
            this.health = this.health - damage;
            System.out.println("You have been hit, " + damage + "DMG recieved");
            System.out.println("Your HP: " + this.health);
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}

