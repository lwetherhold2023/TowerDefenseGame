// Bandit Class inherits from Peasant Class
public class Bandit extends Peasant {
    // set up variables
    boolean dagger; // has a modifier, dagger

    // class constructor - default
    public Bandit() {
        super("");
    }

    // class constructor - alternate
    public Bandit(String type) {
        super(type); // uses the super constructor
    }

    // set dagger
    public void setDagger(boolean dagger) {
        this.dagger = dagger;
    }

    // get dagger
    public boolean getDagger() {
        return this.dagger;
    }

    // get damage
    // overrides the super getDamage method
    @Override
    public double getDamage() {
        maxDbl = 1.5;
        minDbl = 0.8;
        randomMultiplier = Math.random() * (maxDbl - minDbl) + minDbl;
        if (dagger) {
            return ((double)((int)(super.getDamage() * randomMultiplier * 100))) / 100;
        } else {
            return super.getDamage();
        }
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
