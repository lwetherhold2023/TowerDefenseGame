// Wood Class inherits from Thatch Class
public class Wood extends Thatch {
    // class constructor - default
    public Wood() {
        super(0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0);
    }

    // class constructor - alternate
    public Wood(int cost, double health, double damage, double defense, double armor, double range, double fireRate,
                int flammability) {
        super(cost, health, damage, defense, armor, range, fireRate, flammability); // uses the super constructor
    }

    // splinter method makes attacks more piercing
    public void splinter() {
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "";
    }
}
