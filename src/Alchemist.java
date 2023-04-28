import java.util.Random;

// Alchemist Class inherits from Bandit Class
public class Alchemist extends Bandit {
    // set up random number generator
    Random random = new Random();

    // set up variables
    double randomMultiplier; // double that acts as a multiplier for randomization
    int randomInt; // int that acts as a multiplier for randomization
    int potions; // has an extra variable, potions
    boolean chemistry; // has a modifier, chemistry

    // class constructor - default
    public Alchemist() {
        super("", 0.0, 0.0, 0.0, 0.0, 0.0);
        this.potions = 0;
    }

    // class constructor - alternate
    public Alchemist(String type, double health, double damage, double speed,
                     double agility, double strength) {
        super(type, health, damage, speed, agility, strength); // uses the super constructor
        this.potions = 0; // also include the extra variable in the Alchemist constructor
    }

    // set potions
    public void setPotions() {
        this.potions = random.nextInt(11);
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

    // cast method that causes damage
    public void cast() {
        super.health += 75;
        super.damage += 75;
    }

    @Override
    public double getHealth() {
        randomMultiplier = Math.random() * (2 - 0.5) + 0.5;
        if (chemistry) {
            return (double)((((int)(super.getHealth() * randomMultiplier * 100)) / 100));
        } else {
            return super.getHealth();
        }
    }

    @Override
    public double getDamage() {
        for (int i = 0; i < potions; i++) {
            randomInt = random.nextInt(7 + 1);
            super.damage += randomInt;
        }
        return super.getDamage();
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Potions: \t\t" + this.getPotions() + "\n";
    }
}
