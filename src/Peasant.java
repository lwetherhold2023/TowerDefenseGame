// Peasant Class inherits from Enemy Class
public class Peasant extends Enemy {
    // set up variables
    double agility; // has an extra variable, agility
    double strength; // has an extra variable, strength
    boolean poverty; // has a modifier, poverty
    boolean meatshield; // has a modifier, meatshield

    // class constructor - default
    public Peasant() {
        super("");
        this.agility = 0;
        this.strength = 0;
    }

    // class constructor - alternate
    public Peasant(String type) {
        super(type); // uses the super constructor
        this.agility = 0; // also include the extra variable in the Peasant constructor
        this.strength = 0; // also include the extra variable in the Peasant constructor
        setStats(5, 1);
        setElement();
    }

    // set agility
    public void setAgility(double agility) {
        this.agility = agility;
    }

    // get agility
    public double getAgility() {
        return this.agility;
    }

    // set strength
    public void setStrength(double strength) {
        this.strength = strength;
    }

    // get strength
    public double getStrength() {
        return this.strength;
    }

    // set poverty
    public void setPoverty(boolean poverty) {
        this.poverty = poverty;
    }

    // get poverty
    public boolean getPoverty() {
        return this.poverty;
    }

    // set meatshield
    public void setMeatshield(boolean meatshield) {
        this.meatshield = meatshield;
    }

    // get meatshield
    public boolean getMeatshield() {
        return this.meatshield;
    }

    // set stats
    // overrides the super setStats method
    @Override
    public void setStats(int max, int min) {
        super.setStats(max, min);
        setAgility(random.nextInt(max - min + 1) + min);
        setStrength(random.nextInt(max - min + 1) + min);
    }

    @Override
    public double getHealth() {
        max = 5;
        min = 0;
        randomInt = random.nextInt(max - min + 1) + min;
        if (poverty) {
            return super.getHealth() - randomInt;
        }
        maxDbl = 3.8;
        minDbl = 0.37;
        randomMultiplier = Math.random() * (maxDbl - minDbl) + minDbl;
        if (meatshield) {
            return ((double)((int)(super.getHealth() * randomMultiplier * 100))) / 100;
        } else {
            return super.getHealth();
        }
    }

    // beg method that causes damage
    public void beg() {
        super.health += 5;
        super.damage += 5;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Agility: \t\t" + this.getAgility() + "\n" +
                                  "Strength: \t\t" + this.getStrength() + "\n";
    }
}
