// Archer Class inherits from Knight Class
public class Archer extends Knight {
    // set up variables
    int arrows; // has an extra variable, arrows
    boolean bow; // has a modifier, bow

    // class constructor - default
    public Archer() {
        super("", "", 0, 0.0, 0.0, 0.0, 0.0, 0.0);
        this.arrows = 0;
    }

    // class constructor - alternate
    public Archer(String type, String element, int turns, double health, double damage, double speed,
                  double agility, double strength,
                  int arrows) {
        super(type, element, turns, health, damage, speed, agility, strength); // uses the super constructor
        this.arrows = arrows; // also include the extra variable in the Archer constructor
    }

    // set arrows
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    // get arrows
    public int getArrows() {
        return this.arrows;
    }

    // set bow
    public void setBow(boolean bow) {
        this.bow = bow;
    }

    // get bow
    public boolean getBow() {
        return this.bow;
    }

    // shoot method that causes damage
    public void shoot() {
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Arrows: \t\t\t" + this.getArrows() + "\n";
    }
}
