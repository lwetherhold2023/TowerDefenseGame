public class Enemy {
    // set up variables
    protected String element;
    protected int turns;
    protected double health;
    protected double damage;
    protected double speed;

    // class constructor - default
    public Enemy() {
        this.element = "";
        this.turns = 0;
        this.health = 0.0;
        this.damage = 0.0;
        this.speed = 0.0;
    }

    // class constructor - alternate
    public Enemy(String element, int turns, double health, double damage, double speed) {
        this.element = element;
        this.turns = turns;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
    }

    // set element
    public void setElement(String element) {
        this.element = element;
    }

    // get element
    public String getElement() {
        return this.element;
    }

    // set turns
    public void setTurns(int turns) {
        this.turns = turns;
    }

    // get turns
    public int getTurns() {
        return this.turns;
    }

    // set health
    public void setHealth(double health) {
        this.health = health;
    }

    // get health
    public double getHealth() {
        return this.health;
    }

    // set damage
    public void setDamage(double damage) {
        this.damage = damage;
    }

    // get damage
    public double getDamage() {
        return this.damage;
    }

    // set speed
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // get speed
    public double getSpeed() {
        return this.speed;
    }

    // toString method
    public String toString() {
        return "Element: \t\t\t" + this.getElement() + "\n";
    }
}
