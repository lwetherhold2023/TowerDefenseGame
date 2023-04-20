import java.util.Random;

public class Wave {
    // set up random number generator
    Random random = new Random();

    // set up variables
    public double waveHealth = 0;
    public double waveDamage = 0;
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
    }

    // class constructor - alternate
    public Wave(int wave, int enemies) {
        this.wave = wave;
        this.enemies = enemies;
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
        if (wave < 1) {
            int max = 5;
            knights = random.nextInt(max + 1);
            peasants = max - knights;
        }
    }

    // get enemies
    public int getEnemies() {
        return this.enemies;
    }

    // set peasants
    public void setPeasants(int peasants) {
        for (int i = 0; i < peasants; i++) {
            Enemy peasant = new Peasant("", 0, 0.0, 0.0, 0.0,
                    0.0, 0.0);
            ((Peasant)peasant).beg();
            waveHealth += peasant.getHealth();
            waveDamage += peasant.getDamage();
            System.out.print(peasant);
            System.out.print("\n\n");
        }
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
        ///////////////////////////////////////////////
        // PEASANTS
        //////////////////////////////////////////////
        setPeasants(peasants);

        ///////////////////////////////////////////////
        // BANDITS
        //////////////////////////////////////////////

        ///////////////////////////////////////////////
        // KNIGHTS
        //////////////////////////////////////////////

        ///////////////////////////////////////////////
        // ARCHERS
        //////////////////////////////////////////////

        ///////////////////////////////////////////////
        // CAVALIERS
        //////////////////////////////////////////////

        ///////////////////////////////////////////////
        // ALCHEMISTS
        //////////////////////////////////////////////

        ///////////////////////////////////////////////
        // MONKS
        //////////////////////////////////////////////

        ///////////////////////////////////////////////
        // PRIESTS
        //////////////////////////////////////////////

        System.out.println(waveHealth);
        System.out.println(waveDamage);
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
