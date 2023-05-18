// Stone Class inherits from Thatch Class
public class Stone extends Thatch {
    // class constructor - default
    public Stone() {
        super(); // uses the super constructor
        setCost(5000);
        setHealth(125);
        setDamage(150);
        setDefense(7);
        setArmor(6);
        setRange(4);
        setFireRate(13);
        setFlammability(5);
    }

    // bonebreak method causes enemies to take increased damage and slow down
    public void bonebreak() {
        max = 20;
        min = 10;
        randomInt = random.nextInt(max - min + 1) + min;
        super.damage += randomInt;
        max = 8;
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
