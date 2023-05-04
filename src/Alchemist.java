// Alchemist Class inherits from Bandit Class
public class Alchemist extends Bandit {

    // set up variables
    int potions; // has an extra variable, potions
    boolean chemistry; // has a modifier, chemistry

    // class constructor - default
    public Alchemist() {
        super("");
        this.potions = 0;
    }

    // class constructor - alternate
    public Alchemist(String type) {
        super(type); // uses the super constructor
        this.potions = 0; // also include the extra variable in the Alchemist constructor
        setStats(100, 1);
        setPotions();
    }

    // set potions
    public void setPotions() {
        max = 10;
        min = 1;
        this.potions = random.nextInt(max - min + 1) + min;
    }

    // get potions
    public int getPotions() {
        return this.potions;
    }

    // set chemistry
    public void setChemistry(boolean chemistry) {
        this.chemistry = chemistry;
    }

    // get chemistry
    public boolean getChemistry() {
        return this.chemistry;
    }

    // get health
    // overrides the super getHealth method
    @Override
    public double getHealth() {
        maxDbl = 2;
        minDbl = 0.5;
        randomMultiplier = Math.random() * (maxDbl - minDbl) + minDbl;
        if (chemistry) {
            return ((double)((int)(super.getHealth() * randomMultiplier * 100))) / 100;
        } else {
            return super.getHealth();
        }
    }

    // get damage
    // overrides the super getDamage method
    @Override
    public double getDamage() {
        max = 7;
        min = 1;
        for (int i = 0; i < potions; i++) {
            randomInt = random.nextInt(max - min + 1) + min;
            super.damage += randomInt;
        }
        return super.getDamage();
    }

    // cast method that causes damage
    public void cast() {
        super.health += 75;
        super.damage += 75;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Potions: \t\t" + this.getPotions() + "\n";
    }
}
