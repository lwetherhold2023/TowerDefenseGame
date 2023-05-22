// Metal Class inherits from Stone Class
public class Metal extends Stone {
    // class constructor - default
    public Metal() {
        super(); // uses the super constructor
        setCost(10000);
        setHealth(420); // 250
        setDamage(380);
        setDefense(8);
        setArmor(8);
        setRange(3);
        setFireRate(10);
        setFlammability(1);
    }

    // passiveDamage method causes additional damage quickly
    public void passiveDamage() {
        max = 75;
        min = 25;
        randomInt = random.nextInt(max - min + 1) + min;
        super.damage += randomInt;
        max = 70;
        min = 25;
        randomInt = random.nextInt(max - min + 1) + min;
        super.range += randomInt;
        max = 55;
        min = 5;
        randomInt = random.nextInt(max - min + 1) + min;
        super.fireRate += randomInt;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "";
    }
}
