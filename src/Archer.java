// Archer Class inherits from Knight Class
public class Archer extends Knight {
    // set up variables
    int arrows; // has an extra variable, arrows
    boolean bow; // has a modifier, bow

    // class constructor - default
    public Archer() {
        super("");
        this.arrows = 0;
    }

    // class constructor - alternate
    public Archer(String type) {
        super(type); // uses the super constructor
        this.arrows = 0; // also include the extra variable in the Archer constructor
        setStats(50, 1);
        setArrows();
    }

    // set arrows
    public void setArrows() {
        max = 25;
        min = 1;
        this.arrows = random.nextInt(max - min + 1) + min;
    }

    // get arrows
    public int getArrows() {
        return this.arrows;
    }

    // set bow
    public void setBow(boolean bow) {
        this.bow = bow;
    }

    // get bow
    public boolean getBow() {
        return this.bow;
    }

    // get damage
    // overrides the super getDamage method
    @Override
    public double getDamage() {
        max = 3;
        min = 1;
        for (int i = 0; i < arrows; i++) {
            randomInt = random.nextInt(max - min + 1) + min;
            super.damage += randomInt;
        }
        return super.getDamage();
    }

    // get speed
    // overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (bow) {
            return super.getSpeed() + 50;
        } else {
            return super.getSpeed();
        }
    }

    // shoot method that causes damage
    public void shoot() {
        super.health += 20;
        super.damage += 20;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Arrows: \t\t" + this.getArrows() + "\n";
    }
}
