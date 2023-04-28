import java.util.Random;

public class Enemy {
    // set up random number generator
    Random random = new Random();

    // set up variables
    private int randomInt;
    protected String type;
    protected String element;
    protected double health;
    protected double damage;
    protected double speed;

    // set up elements list
    String[] elementList = {"N/A", "Fire", "Water", "Earth", "Wind", "Air", "Ice"};

    // class constructor - default
    public Enemy() {
        this.type = "";
        this.element = "";
        this.health = 0.0;
        this.damage = 0.0;
        this.speed = 0.0;
    }

    // class constructor - alternate
    public Enemy(String type, double health, double damage, double speed) {
        this.type = type;
        this.element = "";
        this.health = health;
        this.damage = damage;
        this.speed = speed;
    }

    // set type
    public void setType(String type) {
        this.type = type;
    }

    // get type
    public String getType() {
        return this.type;
    }

    // set element
    public void setElement() {
        randomInt = random.nextInt(elementList.length);
        this.element = elementList[randomInt];
    }

    // get element
    public String getElement() {
        return this.element;
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
        return "Type: \t\t\t" + this.getType() + "\n" +
               "Element: \t\t" + this.getElement() + "\n" +
               "Health: \t\t" + this.getHealth() + "\n" +
               "Damage: \t\t" + this.getDamage() + "\n" +
               "Speed: \t\t\t" + this.getSpeed() + "\n";
    }
}
