// Knight Class inherits from Peasant Class
public class Knight extends Peasant {
    // set up variables
    boolean sword; // has a modifier, sword

    // class constructor - default
    public Knight() {
        super("");
    }

    // class constructor - alternate
    public Knight(String type) {
        super(type); // uses the super constructor
        setStats(15, 1);
    }

    // set sword
    public void setSword(boolean sword) {
        this.sword = sword;
    }

    // get sword
    public boolean getSword() {
        return this.sword;
    }

    @Override
    public double getDamage() {
        max = 10;
        min = 1;
        randomInt = random.nextInt(max - min + 1) + min;
        if (sword) {
            return super.getDamage() + randomInt;
        } else {
            return super.getDamage();
        }
    }

    // hit method that causes damage
    public void hit() {
        super.health += 15;
        super.damage += 15;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "";
    }
}
