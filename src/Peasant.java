// Peasant Class inherits from Enemy Class
public class Peasant extends Enemy {
    // set up variables
    double agility; // has an extra variable, agility
    double strength; // has an extra variable, strength
    boolean poverty; // has a modifier, poverty
    boolean meatshield; // has a modifier, meatshield

    // class constructor - default
    public Peasant() {
        super("", 0, 0.0, 0.0, 0.0);
        this.agility = 0;
        this.strength = 0;
    }

    // class constructor - alternate
    public Peasant(String element, int turns, double health, double damage, double speed,
                   double agility, double strength) {
        super(element, turns, health, damage, speed); // uses the super constructor
        this.agility = agility; // also include the extra variable in the Peasant constructor
        this.strength = strength; // also include the extra variable in the Peasant constructor
    }

    // set agility
    public void setAgility(double agility) {
        this.agility = agility;
    }

    // get agility
    public double getAgility() {
        return this.agility;
    }

    // set strength
    public void setStrength(double strength) {
        this.strength = strength;
    }

    // get strength
    public double getStrength() {
        return this.strength;
    }

    // set poverty
    public void setPoverty(boolean poverty) {
        this.poverty = poverty;
    }

    // get poverty
    public boolean getPoverty() {
        return this.poverty;
    }

    // set meatshield
    public void setMeatshield(boolean meatshield) {
        this.meatshield = meatshield;
    }

    // get meatshield
    public boolean getMeatshield() {
        return this.meatshield;
    }

    // beg method that causes damage
    public void beg() {
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Agility: \t\t\t" + this.getAgility() + "\n" +
                                  "Strength: \t\t\t" + this.getStrength() + "\n";
    }
}
