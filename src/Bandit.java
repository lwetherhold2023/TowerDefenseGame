// Bandit Class inherits from Peasant Class
public class Bandit extends Peasant {
    // set up variables
    boolean dagger; // has a modifier, dagger

    // class constructor - default
    public Bandit() {
        super("", "", 0, 0.0, 0.0, 0.0, 0.0, 0.0);
    }

    // class constructor - alternate
    public Bandit(String type, String element, int turns, double health, double damage, double speed,
                  double agility, double strength) {
        super(type, element, turns, health, damage, speed, agility, strength); // uses the super constructor
    }

    // set dagger
    public void setDagger(boolean dagger) {
        this.dagger = dagger;
    }

    // get dagger
    public boolean getDagger() {
        return this.dagger;
    }

    // stab method that causes damage
    public void stab() {
        super.health += 10;
        super.damage += 10;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "";
    }
}
