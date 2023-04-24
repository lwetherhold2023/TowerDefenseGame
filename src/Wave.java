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

    // set enemies (RANDOM NUMBER FOR EACH ENEMY TYPE BASED ON WAVE # AND LEVELED BY INHERITANCE STRUCTURE IN DIFFICULTY
    public void setEnemies(int enemies) {
        this.enemies = enemies;
        if (wave < 1) {
            int max = 5;
            this.peasants = random.nextInt(max + 1);
            this.bandits = max - getPeasants();
        } else if (wave < 3) {
            int max = 15;
            this.peasants = random.nextInt(max + 1);
            this.bandits = random.nextInt(max - getPeasants() + 1);
            this.knights = random.nextInt(max - getBandits() + 1);
        } else if (wave < 5) {
            int max = 25;
            this.peasants = random.nextInt(max + 1);
            this.bandits = random.nextInt(max - getPeasants() + 1);
            this.knights = random.nextInt(max - getBandits() + 1);
            this.archers = random.nextInt(max - getKnights() + 1);
            this.cavaliers = random.nextInt(max - getArchers() + 1);
        } else if (wave < 10) {
            int max = 50;
            this.peasants = random.nextInt(max + 1);
            this.bandits = random.nextInt(max - getPeasants() + 1);
            this.knights = random.nextInt(max - getBandits() + 1);
            this.archers = random.nextInt(max - getKnights() + 1);
            this.cavaliers = random.nextInt(max - getArchers() + 1);
            this.alchemists = random.nextInt(max - getCavaliers() + 1);
            this.monks = random.nextInt(max - getAlchemists() + 1);
        } else {
            // wave 10+
            // obtain a number between [51 - 100]
            int max = random.nextInt(100 + 51);
            this.peasants = random.nextInt(max + 1);
            this.bandits = random.nextInt(max - getPeasants() + 1);
            this.knights = random.nextInt(max - getBandits() + 1);
            this.archers = random.nextInt(max - getKnights() + 1);
            this.cavaliers = random.nextInt(max - getArchers() + 1);
            this.alchemists = random.nextInt(max - getCavaliers() + 1);
            this.monks = random.nextInt(max - getAlchemists() + 1);
            this.priests = random.nextInt(max - getMonks() + 1);
        }
    }

    // get enemies
    public int getEnemies() {
        return this.enemies;
    }

    // set peasants
    public void setPeasants(int peasants) {
        for (int i = 0; i < peasants; i++) {
            Enemy peasant = new Peasant("Peasant " + (i + 1), "N/A", 0, 0.0, 0.0, 0.0, 0.0, 0.0);
            ((Peasant)peasant).setPoverty(true);
            ((Peasant)peasant).setMeatshield(true);
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
        for (int i = 0; i < bandits; i++) {
            Enemy bandit = new Bandit("Bandit " + (i + 1), "N/A", 0, 0.0, 0.0, 0.0, 0.0, 0.0);
            ((Bandit)bandit).setDagger(true);
            ((Bandit)bandit).stab();
            waveHealth += bandit.getHealth();
            waveDamage += bandit.getDamage();
            System.out.print(bandit);
            System.out.print("\n\n");
        }
    }

    // get bandits
    public int getBandits() {
        return this.bandits;
    }

    // set knights
    public void setKnights(int knights) {
        for (int i = 0; i < knights; i++) {
            Enemy knight = new Knight("Knight " + (i + 1), "N/A", 0, 0.0, 0.0, 0.0, 0.0, 0.0);
            ((Knight)knight).setSword(true);
            ((Knight)knight).hit();
            waveHealth += knight.getHealth();
            waveDamage += knight.getDamage();
            System.out.print(knight);
            System.out.print("\n\n");
        }
    }

    // get knights
    public int getKnights() {
        return this.knights;
    }

    // set archers
    public void setArchers(int archers) {
        for (int i = 0; i < archers; i++) {
            Enemy archer = new Archer("Archer " + (i + 1), "N/A", 0, 0.0, 0.0, 0.0, 0.0, 0.0, 0);
            ((Archer)archer).setArrows(0);
            ((Archer)archer).setBow(true);
            ((Archer)archer).shoot();
            waveHealth += archer.getHealth();
            waveDamage += archer.getDamage();
            System.out.print(archer);
            System.out.print("\n\n");
        }
    }

    // get archers
    public int getArchers() {
        return this.archers;
    }

    // set cavaliers
    public void setCavaliers(int cavaliers) {
        for (int i = 0; i < cavaliers; i++) {
            Enemy cavalier = new Cavalier("Cavalier " + (i + 1), "N/A", 0, 0.0, 0.0, 0.0, 0.0, 0.0, 0);
            ((Cavalier)cavalier).setHorse(true);
            ((Cavalier)cavalier).trample();
            waveHealth += cavalier.getHealth();
            waveDamage += cavalier.getDamage();
            System.out.print(cavalier);
            System.out.print("\n\n");
        }
    }

    // get cavaliers
    public int getCavaliers() {
        return this.cavaliers;
    }

    // set alchemists
    public void setAlchemists(int alchemists) {
        for (int i = 0; i < alchemists; i++) {
            Enemy alchemist = new Alchemist("Alchemist " + (i + 1), "N/A", 0, 0.0, 0.0, 0.0, 0.0, 0.0, 0);
            ((Alchemist)alchemist).setPotions(0);
            ((Alchemist)alchemist).setChemistry(true);
            ((Alchemist)alchemist).cast();
            waveHealth += alchemist.getHealth();
            waveDamage += alchemist.getDamage();
            System.out.print(alchemist);
            System.out.print("\n\n");
        }
    }

    // get alchemists
    public int getAlchemists() {
        return this.alchemists;
    }

    // set monks
    public void setMonks(int monks) {
        for (int i = 0; i < monks; i++) {
            Enemy monk = new Monk("Monk " + (i + 1), "N/A", 0, 0.0, 0.0, 0.0, 0.0, 0.0, 0);
            ((Monk)monk).setItems(0);
            ((Monk)monk).setWisdom(true);
            ((Monk)monk).setBaldness(true);
            ((Monk)monk).meditate();
            waveHealth += monk.getHealth();
            waveDamage += monk.getDamage();
            System.out.print(monk);
            System.out.print("\n\n");
        }
    }

    // get monks
    public int getMonks() {
        return this.monks;
    }

    // set priests
    public void setPriests(int priests) {
        for (int i = 0; i < priests; i++) {
            Enemy priest = new Priest("Priest " + (i + 1), "N/A", 0, 0.0, 0.0, 0.0, 0.0, 0.0, 0, 0);
            ((Priest)priest).setEucharists(0);
            ((Priest)priest).setBible(true);
            ((Priest)priest).setCrucifix(true);
            ((Priest)priest).pray();
            waveHealth += priest.getHealth();
            waveDamage += priest.getDamage();
            System.out.print(priest);
            System.out.print("\n\n");
        }
    }

    // get priests
    public int getPriests() {
        return this.priests;
    }

    // according to number of each enemy type, enemies are created
    public void create() {
        setPeasants(peasants);
        setBandits(bandits);
        setKnights(knights);
        setArchers(archers);
        setCavaliers(cavaliers);
        setAlchemists(alchemists);
        setMonks(monks);
        setPriests(priests);

        System.out.println("Wave " + getWave() + " Health: " + waveHealth);
        System.out.println("Wave " + getWave() + " Damage: " + waveDamage);
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
