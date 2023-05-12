// Priest Class inherits from Monk Class
public class Priest extends Monk {
    // set up variables
    int eucharists; // has an extra variable, eucharists
    boolean bible; // has a modifier, bible
    boolean crucifix; // has a modifier, crucifix

    // class constructor - default
    public Priest() {
        super("");
        this.eucharists = 0;
    }

    // class constructor - alternate
    public Priest(String type) {
        super(type); // uses the super constructor
        this.eucharists = 0; // also include the extra variable in the Priest constructor
        setStats(275, 1);
        setEucharists();
    }

    // set eucharists
    public void setEucharists() {
        max = 25;
        min = 5;
        this.eucharists = random.nextInt(max - min + 1) + min;
    }

    // get eucharists
    public int getEucharists() {
        return this.eucharists;
    }

    // set bible
    public void setBible(boolean bible) {
        this.bible = bible;
    }

    // get bible
    public boolean getBible() {
        return this.bible;
    }

    // set crucifix
    public void setCrucifix(boolean crucifix) {
        this.crucifix = crucifix;
    }

    // get crucifix
    public boolean getCrucifix() {
        return this.crucifix;
    }

    @Override
    public double getDamage() {
        max = 15;
        min = 3;
        for (int i = 0; i < eucharists; i++) {
            randomInt = random.nextInt(max - min + 1) + min;
            super.damage += randomInt;
        }
        return super.getDamage();
    }

    @Override
    public double getSpeed() {
        maxDbl = 1.34;
        minDbl = 0.91;
        randomMultiplier = Math.random() * (maxDbl - minDbl) + minDbl;
        if (crucifix) {
            return ((double)((int)(super.getSpeed() * randomMultiplier * 100))) / 100;
        } else {
            return super.getSpeed();
        }
    }

    @Override
    public double getStrength() {
        maxDbl = 1.6;
        minDbl = 0.85;
        randomMultiplier = Math.random() * (maxDbl - minDbl) + minDbl;
        if (bible) {
            return ((double)((int)(super.getStrength() * randomMultiplier * 100))) / 100;
        } else {
            return super.getStrength();
        }
    }

    // pray method that causes damage
    public void pray() {
        super.health += 150;
        super.damage += 150;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Eucharists: \t" + this.getEucharists() + "\n";
    }
}
