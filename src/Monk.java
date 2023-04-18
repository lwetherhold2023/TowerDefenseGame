// Monk Class inherits from Bandit Class
public class Monk extends Bandit {
    // set up variables
    int items; // has an extra variable, items
    boolean wisdom; // has a modifier, wisdom
    boolean baldness; // has a modifier, baldness

    // class constructor - default
    public Monk() {
        super("", 0, 0.0, 0.0, 0.0, 0.0, 0.0);
        this.items = 0;
    }

    // class constructor - alternate
    public Monk(String element, int turns, double health, double damage, double speed,
                double agility, double strength,
                int items) {
        super(element, turns, health, damage, speed, agility, strength); // uses the super constructor
        this.items = items; // also include the extra variable in the Monk constructor
    }

    // set items
    public void setItems(int items) {
        this.items = items;
    }

    // get items
    public int getItems() {
        return this.items;
    }

    // set wisdom
    public void setWisdom(boolean wisdom) {
        this.wisdom = wisdom;
    }

    // get wisdom
    public boolean getWisdom() {
        return this.wisdom;
    }

    // set baldness
    public void setBaldness(boolean baldness) {
        this.baldness = baldness;
    }

    // get baldness
    public boolean getBaldness() {
        return this.baldness;
    }

    // meditate method that causes damage
    public void meditate() {
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Items: \t\t\t" + this.getItems() + "\n";
    }
}
