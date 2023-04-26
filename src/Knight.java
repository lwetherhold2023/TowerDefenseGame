// Knight Class inherits from Peasant Class
public class Knight extends Peasant {
    // set up variables
    boolean sword; // has a modifier, sword

    // class constructor - default
    public Knight() {
        super("", "", 0, 0.0, 0.0, 0.0, 0.0, 0.0);
    }

    // class constructor - alternate
    public Knight(String type, String element, int turns, double health, double damage, double speed,
                  double agility, double strength) {
        super(type, element, turns, health, damage, speed, agility, strength); // uses the super constructor
    }

    // set sword
    public void setSword(boolean sword) {
        this.sword = sword;
    }

    // get sword
    public boolean getSword() {
        return this.sword;
    }

    // hit method that causes damage
    public void hit() {
        super.health += 15;
        super.damage += 15;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "";
    }
}
