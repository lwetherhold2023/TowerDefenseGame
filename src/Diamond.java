// Diamond Class inherits from Metal Class
public class Diamond extends Metal {
    // class constructor - default
    public Diamond() {
        super(0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0);
    }

    // class constructor - alternate
    public Diamond(int cost, double health, double damage, double defense, double armor, double range, double fireRate,
                   int flammability) {
        super(cost, health, damage, defense, armor, range, fireRate, flammability); // uses the super constructor
    }

    // knockback method decreases enemy efficiency
    public void knockback() {
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "";
    }
}
