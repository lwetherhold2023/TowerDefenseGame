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

    // get wave

    // set enemies (RANDOM NUMBER EACH TYPE BASED ON WAVE # AND LEVELED BY INHERITANCE STRUCTURE

    // get enemies

    // set peasants

    // get peasants

    // set bandits

    // get bandits

    // set knights

    // get knights

    // set archers

    // get archers

    // set cavaliers

    // get cavaliers

    // set alchemists

    // get alchemists

    // set monks

    // get monks

    // set priests

    // get priests

    // according to number of each enemy type, enemies are created
    public void create() {
    }

    // attack method represents an enemy wave attacking the towers (total attack pool and modified health pool)
    public void attack() {
    }

    // toString method
    public String toString() {
        return "";
    }
}
