// Cavalier Class inherits from Archer Class
public class Cavalier extends Archer {
    // set up variables
    boolean horse; // has a modifier, horse

    // class constructor - default
    public Cavalier() {
        super("", "", 0, 0.0, 0.0, 0.0, 0.0, 0.0, 0);
    }

    // class constructor - alternate
    public Cavalier(String type, String element, int turns, double health, double damage, double speed,
                    double agility, double strength,
                    int arrows) {
        super(type, element, turns, health, damage, speed, agility, strength, arrows); // uses the super constructor
    }

    // set horse
    public void setHorse(boolean horse) {
        this.horse = horse;
    }

    // get horse
    public boolean getHorse() {
        return this.horse;
    }

    // trample method that causes damage
    public void trample() {
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "";
    }
}
