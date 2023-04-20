// Stone Class inherits from Thatch Class
public class Stone extends Thatch {
    // class constructor - default
    public Stone() {
        super(0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0);
    }

    // class constructor - alternate
    public Stone(int cost, double health, double damage, double defense, double armor, double range, double fireRate,
                 int flammability) {
        super(cost, health, damage, defense, armor, range, fireRate, flammability); // uses the super constructor
    }

    // bonebreak method causes enemies to take increased damage and slow down
    public void bonebreak() {
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "";
    }
}
