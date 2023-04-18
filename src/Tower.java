public class Tower {
    // set up variables
    protected int cost;
    protected double health;
    protected double damage;
    protected double defense;
    protected double armor;
    protected double range;
    protected double fireRate;

    // class constructor - default
    public Tower() {
        this.cost = 0;
        this.health = 0.0;
        this.damage = 0.0;
        this.defense = 0.0;
        this.armor = 0.0;
        this.range = 0.0;
        this.fireRate = 0.0;
    }

   // class constructor - alternate
    public Tower(int cost, double health, double damage, double defense, double armor, double range, double fireRate) {
        this.cost = cost;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.armor = armor;
        this.range = range;
        this.fireRate = fireRate;
    }

    // set cost
    public void setCost(int cost) {
        this.cost = cost;
    }

    // get cost
    public int getCost() {
        return this.cost;
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

    // set defense
    public void setDefense(double defense) {
        this.defense = defense;
    }

    // get defense
    public double getDefense() {
        return this.defense;
    }

    // set armor
    public void setArmor(double armor) {
        this.armor = armor;
    }

    // get armor
    public double getArmor() {
        return this.armor;
    }

    // set range
    public void setRange(double range) {
        this.range = range;
    }

    // get range
    public double getRange() {
        return this.range;
    }

    // set fireRate
    public void setFireRate(double fireRate) {
        this.fireRate = fireRate;
    }

    // get fireRate
    public double getFireRate() {
        return this.fireRate;
    }

    // attack method represents the towers attacking an enemy wave (total attack pool and modified health pool)
    public void attack() {
    }

    // toString method
    public String toString() {
        return "Health: \t\t\t" + this.getHealth() + "\n" +
               "Damage: \t\t\t" + this.getDamage() + "\n" +
               "Defense: \t\t\t" + this.getDefense() + "\n" +
               "Armor: \t\t\t" + this.getArmor() + "\n" +
               "Range: \t\t\t" + this.getRange() + "\n" +
               "Fire Rate: \t\t\t" + this.getFireRate() + "\n";
    }
}
