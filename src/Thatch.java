// Thatch Class inherits from Tower Class
public class Thatch extends Tower {
    // set up variables
    int flammability; // has an extra variable, flammability

    // class constructor - default
    public Thatch() {
        super(0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0); // uses the super constructor
        this.flammability = 0; // also include the extra variable in the Thatch constructor
        setCost(1000);
        setHealth(10);
        setDamage(8);
        setDefense(3);
        setArmor(2);
        setRange(4);
        setFireRate(25);
        setFlammability(10);
    }

    // set flammability
    public void setFlammability(int flammability) {
        this.flammability = flammability;
    }

    // get flammability
    public int getFlammability() {
        return this.flammability;
    }

    // get armor
    // overrides the super getArmor method
    @Override
    public double getArmor() {
        if (this.flammability == 10) {
            maxDbl = 0.5;
            minDbl = 0.1;
        } else if (this.flammability >= 8) {
            maxDbl = 0.78;
            minDbl = 0.45;
        } else if (this.flammability >= 5) {
            maxDbl = 0.87;
            minDbl = 0.63;
        } else if (this.flammability >= 1) {
            maxDbl = 0.99;
            minDbl = 0.85;
        } else {
            maxDbl = 1;
            minDbl = 1;
        }
        randomMultiplier = Math.random() * (maxDbl - minDbl) + minDbl;
        return ((double)((int)(super.getArmor() * randomMultiplier * 100))) / 100;
    }

    // sleep method provides an armor buff while slowing down fire rate
    public void sleep() {
        double buff = getArmor() + 15;
        double debuff = getFireRate() - 5;
        setArmor(buff);
        setFireRate(debuff);
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Flammability (0-10): \t" + this.getFlammability() + "\n";
    }
}
