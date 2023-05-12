// Cavalier Class inherits from Archer Class
public class Cavalier extends Archer {
    // set up variables
    boolean horse; // has a modifier, horse

    // class constructor - default
    public Cavalier() {
        super("");
    }

    // class constructor - alternate
    public Cavalier(String type) {
        super(type); // uses the super constructor
        setStats(25, 1);
    }

    // set horse
    public void setHorse(boolean horse) {
        this.horse = horse;
    }

    // get horse
    public boolean getHorse() {
        return this.horse;
    }

    @Override
    public double getDamage() {
        max = 85;
        min = 25;
        randomInt = random.nextInt(max - min + 1) + min;
        if (horse) {
            return super.getDamage() + randomInt;
        } else {
            return super.getDamage();
        }
    }

    @Override
    public double getStrength() {
        return super.getStrength() + 45;
    }

    @Override
    public double getSpeed() {
        return super.getSpeed() + 75;
    }

    @Override
    public double getAgility() {
        return super.getAgility() + 15;
    }

    // trample method that causes damage
    public void trample() {
        super.health += 50;
        super.damage += 50;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "";
    }
}
