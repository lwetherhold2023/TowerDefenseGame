// Monk Class inherits from Bandit Class
public class Monk extends Bandit {
    // set up variables
    int items; // has an extra variable, items
    boolean wisdom; // has a modifier, wisdom
    boolean baldness; // has a modifier, baldness

    // class constructor - default
    public Monk() {
        super("");
        this.items = 0;
    }

    // class constructor - alternate
    public Monk(String type) {
        super(type); // uses the super constructor
        this.items = 0; // also include the extra variable in the Monk constructor
        setStats(150, 1);
        setItems();
    }

    // set items
    public void setItems() {
        this.items = 0;
    }

    // get items
    public int getItems() {
        return this.items;
    }

    // set wisdom
    public void setWisdom(boolean wisdom) {
        this.wisdom = wisdom;
    }

    // get wisdom
    public boolean getWisdom() {
        return this.wisdom;
    }

    // set baldness
    public void setBaldness(boolean baldness) {
        this.baldness = baldness;
    }

    // get baldness
    public boolean getBaldness() {
        return this.baldness;
    }

    @Override
    public double getDamage() {
        max = 125;
        min = 50;
        randomInt = random.nextInt(max - min + 1) + min;
        if (wisdom) {
            return super.getDamage() + randomInt;
        }
        randomInt = random.nextInt(max - min + 1) + min;
        if (baldness) {
            return super.getDamage() + randomInt;
        } else {
            return super.getDamage();
        }
    }

    @Override
    public double getAgility() {
        max = 115;
        min = 65;
        randomInt = random.nextInt(max - min + 1) + min;
        if (wisdom) {
            return super.getAgility() + randomInt;
        } else {
            return super.getAgility();
        }
    }

    // meditate method that causes damage
    public void meditate() {
        super.health += 100;
        super.damage += 100;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Items: \t\t\t" + this.getItems() + "\n";
    }
}
