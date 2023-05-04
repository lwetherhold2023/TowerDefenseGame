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
    }

    // set eucharists
    public void setEucharists(int eucharists) {
        this.eucharists = eucharists;
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
