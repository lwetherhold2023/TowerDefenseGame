// Diamond Class inherits from Metal Class
public class Diamond extends Metal {
    // class constructor - default
    public Diamond() {
        super(); // uses the super constructor
        setCost(50000);
        setHealth(550);
        setDamage(850);
        setDefense(10);
        setArmor(10);
        setRange(6);
        setFireRate(3);
        setFlammability(0);
    }

    // knockback method decreases enemy efficiency
    public void knockback() {
        max = 400;
        min = 50;
        randomInt = random.nextInt(max - min + 1) + min;
        super.damage += randomInt;
        max = 250;
        min = 80;
        randomInt = random.nextInt(max - min + 1) + min;
        super.defense += randomInt;
        max = 125;
        min = 75;
        randomInt = random.nextInt(max - min + 1) + min;
        super.range += randomInt;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "";
    }
}
