// Alchemist Class inherits from Bandit Class
public class Alchemist extends Bandit {
    // set up variables
    int potions; // has an extra variable, potions
    boolean chemistry; // has a modifier, chemistry

    // class constructor - default
    public Alchemist() {
        super("", "", 0, 0.0, 0.0, 0.0, 0.0, 0.0);
        this.potions = 0;
    }

    // class constructor - alternate
    public Alchemist(String type, String element, int turns, double health, double damage, double speed,
                     double agility, double strength,
                     int potions) {
        super(type, element, turns, health, damage, speed, agility, strength); // uses the super constructor
        this.potions = potions; // also include the extra variable in the Alchemist constructor
    }

    // set potions
    public void setPotions(int potions) {
        this.potions = potions;
    }

    // get potions
    public int getPotions() {
        return this.potions;
    }

    // set chemistry
    public void setChemistry(boolean chemistry) {
        this.chemistry = chemistry;
    }

    // get chemistry
    public boolean getChemistry() {
        return this.chemistry;
    }

    // cast method that causes damage
    public void cast() {
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Potions: \t\t\t" + this.getPotions() + "\n";
    }
}
