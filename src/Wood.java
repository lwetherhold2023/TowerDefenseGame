// Wood Class inherits from Thatch Class
public class Wood extends Thatch {
    // class constructor - default
    public Wood() {
        super(); // uses the super constructor
        setCost(2500);
        setHealth(55);
        setDamage(62);
        setDefense(4);
        setArmor(3);
        setRange(2);
        setFireRate(15);
        setFlammability(8);
    }

    // splinter method makes attacks more piercing
    public void splinter() {
        max = 13;
        min = 3;
        randomInt = random.nextInt(max - min + 1) + min;
        super.damage += randomInt;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "";
    }
}
