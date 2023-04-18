// Thatch Class inherits from Tower Class
public class Thatch extends Tower {
    // set up variables
    int flammability; // has an extra variable, flammability

    // class constructor - default
    public Thatch() {
        super(0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        this.flammability = 0;
    }

    // class constructor - alternate
    public Thatch(int cost, double health, double damage, double defense, double armor, double range, double fireRate,
                  int flammability) {
        super(cost, health, damage, defense, armor, range, fireRate); // uses the super constructor
        this.flammability = flammability; // also include the extra variable in the Thatch constructor
    }

    // set flammability
    public void setFlammability(int flammability) {
        this.flammability = flammability;
    }

    // get flammability
    public int getFlammability() {
        return this.flammability;
    }

    // get armor
    // overrides the super getArmor method
    @Override
    public double getArmor() {
        return super.getArmor();
    }

    // sleep method provides an armor buff and causes enemies to become sleepy
    public void sleep() {
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Flammability (0-10): \t\t\t" + this.getFlammability() + "\n";
    }
}
