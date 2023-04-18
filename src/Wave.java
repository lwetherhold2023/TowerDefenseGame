public class Wave {
    // set up variables
    private int wave;
    private int enemies;
    private int peasants;
    private int bandits;
    private int knights;
    private int archers;
    private int cavaliers;
    private int alchemists;
    private int monks;
    private int priests;

    // class constructor - default
    public Wave() {
        this.wave = 0;
        this.enemies = 0;
        this.peasants = 0;
        this.bandits = 0;
        this.knights = 0;
        this.archers = 0;
        this.cavaliers = 0;
        this.alchemists = 0;
        this.monks = 0;
        this.priests = 0;
    }

    // class constructor - alternate
    public Wave(int wave, int enemies, int peasants, int bandits, int knights, int archers, int cavaliers, int alchemists, int monks, int priests) {
        this.wave = wave;
        this.enemies = enemies;
        this.peasants = peasants;
        this.bandits = bandits;
        this.knights = knights;
        this.archers = archers;
        this.cavaliers = cavaliers;
        this.alchemists = alchemists;
        this.monks = monks;
        this.priests = priests;
    }

    // set wave
    public void setWave(int wave) {
        this.wave = wave;
    }

    // get wave
    public int getWave() {
        return this.wave;
    }

    // set enemies (RANDOM NUMBER EACH TYPE BASED ON WAVE # AND LEVELED BY INHERITANCE STRUCTURE
    public void setEnemies(int enemies) {
        this.enemies = enemies;
    }

    // get enemies
    public int getEnemies() {
        return this.enemies;
    }

    // set peasants
    public void setPeasants(int peasants) {
        this.peasants = peasants;
    }

    // get peasants
    public int getPeasants() {
        return this.peasants;
    }

    // set bandits
    public void setBandits(int bandits) {
        this.bandits = bandits;
    }

    // get bandits
    public int getBandits() {
        return this.bandits;
    }

    // set knights
    public void setKnights(int knights) {
        this.knights = knights;
    }

    // get knights
    public int getKnights() {
        return this.knights;
    }

    // set archers
    public void setArchers(int archers) {
        this.archers = archers;
    }

    // get archers
    public int getArchers() {
        return this.archers;
    }

    // set cavaliers
    public void setCavaliers(int cavaliers) {
        this.cavaliers = cavaliers;
    }

    // get cavaliers
    public int getCavaliers() {
        return this.cavaliers;
    }

    // set alchemists
    public void setAlchemists(int alchemists) {
        this.alchemists = alchemists;
    }

    // get alchemists
    public int getAlchemists() {
        return this.alchemists;
    }

    // set monks
    public void setMonks(int monks) {
        this.monks = monks;
    }

    // get monks
    public int getMonks() {
        return this.monks;
    }

    // set priests
    public void setPriests(int priests) {
        this.priests = priests;
    }

    // get priests
    public int getPriests() {
        return this.priests;
    }

    // according to number of each enemy type, enemies are created
    public void create() {
    }

    // attack method represents an enemy wave attacking the towers (total attack pool and modified health pool)
    public void attack() {
    }

    // toString method
    public String toString() {
        return "Wave: \t\t\t" + this.getWave() + "\n" +
               "Enemies: \t\t\t" + this.getEnemies() + "\n" +
                  "Peasants: \t\t\t\t" + this.getPeasants() + "\n" +
                  "Bandits: \t\t\t\t" + this.getBandits() + "\n" +
                  "Knights: \t\t\t\t" + this.getKnights() + "\n" +
                  "Archers: \t\t\t\t" + this.getArchers() + "\n" +
                  "Cavaliers: \t\t\t\t" + this.getCavaliers() + "\n" +
                  "Alchemists: \t\t\t\t" + this.getAlchemists() + "\n" +
                  "Monks: \t\t\t\t" + this.getMonks() + "\n" +
                  "Priests: \t\t\t\t" + this.getPriests() + "\n";
    }
}
