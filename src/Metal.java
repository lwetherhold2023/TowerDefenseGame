// Metal Class inherits from Stone Class
public class Metal extends Stone {
    // class constructor - default
    public Metal() {
        super(0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0);
    }

    // class constructor - alternate
    public Metal(int cost, double health, double damage, double defense, double armor, double range, double fireRate,
                 int flammability) {
        super(cost, health, damage, defense, armor, range, fireRate, flammability); // uses the super constructor
    }

    // passiveDamage method causes additional damage quickly
    public void passiveDamage() {
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "";
    }
}
