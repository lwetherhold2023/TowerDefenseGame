import java.util.Random;

public class Wave {
    // set up random number generator
    Random random = new Random();

    // set up variables
    public double waveHealth = 0;
    public double waveDamage = 0;
    int max;
    int remaining;
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
    }

    // class constructor - alternate
    public Wave(int wave) {
        this.wave = wave;
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
    public void setEnemies() {
        if (wave < 1) {
            max = 5;
            remaining = max;
            this.enemies = max;
            this.peasants = random.nextInt(max + 1);
            remaining -= this.peasants;
            this.bandits = remaining;
        } else if (wave < 3) {
            max = 15;
            remaining = max;
            this.enemies = max;
            this.peasants = random.nextInt(max + 1);
            remaining -= this.peasants;
            this.bandits = random.nextInt(remaining + 1);
            remaining -= this.bandits;
            this.knights = remaining;
        } else if (wave < 5) {
            max = 25;
            remaining = max;
            this.enemies = max;
            this.peasants = random.nextInt(max + 1);
            remaining -= this.peasants;
            this.bandits = random.nextInt(remaining + 1);
            remaining -= this.bandits;
            this.knights = random.nextInt(remaining + 1);
            remaining -= this.knights;
            this.archers = random.nextInt(remaining + 1);
            remaining -= this.archers;
            this.cavaliers = remaining;
        } else if (wave < 10) {
            max = 50;
            remaining = max;
            this.enemies = max;
            this.peasants = random.nextInt(max + 1);
            remaining -= this.peasants;
            this.bandits = random.nextInt(remaining + 1);
            remaining -= this.bandits;
            this.knights = random.nextInt(remaining + 1);
            remaining -= this.knights;
            this.archers = random.nextInt(remaining + 1);
            remaining -= this.archers;
            this.cavaliers = random.nextInt(remaining + 1);
            remaining -= this.cavaliers;
            this.alchemists = random.nextInt(remaining + 1);
            remaining -= this.alchemists;
            this.monks = remaining;
        } else {
            // wave 10+
            // obtain a number between [0 - 49]
            // obtain a number between [51, 100]
            max = random.nextInt(50) + 51;
            // (int)(Math.random() * (max - min) + min)
            remaining = max;
            this.enemies = max;
            this.peasants = random.nextInt(max + 1);
            remaining -= this.peasants;
            this.bandits = random.nextInt(remaining + 1);
            remaining -= this.bandits;
            this.knights = random.nextInt(remaining + 1);
            remaining -= this.knights;
            this.archers = random.nextInt(remaining + 1);
            remaining -= this.archers;
            this.cavaliers = random.nextInt(remaining + 1);
            remaining -= this.cavaliers;
            this.alchemists = random.nextInt(remaining + 1);
            remaining -= this.alchemists;
            this.monks = random.nextInt(remaining + 1);
            remaining -= this.monks;
            this.priests = remaining;
        }
    }

    // get enemies
    public int getEnemies() {
        return this.enemies;
    }

    // set peasants
    public void setPeasants(int peasants) {
        for (int i = 0; i < peasants; i++) {
            Enemy peasant = new Peasant("Peasant " + (i + 1));
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
            Enemy bandit = new Bandit("Bandit " + (i + 1));
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
            Enemy knight = new Knight("Knight " + (i + 1));
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
            Enemy archer = new Archer("Archer " + (i + 1));
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
            Enemy cavalier = new Cavalier("Cavalier " + (i + 1));
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
            Enemy alchemist = new Alchemist("Alchemist " + (i + 1));
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
            Enemy monk = new Monk("Monk " + (i + 1));
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
            Enemy priest = new Priest("Priest " + (i + 1));
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
    }

    // attack method represents an enemy wave attacking the towers (total attack pool and modified health pool)
    public void attack() {
    }

    // toString method
    public String toString() {
        return "Wave: \t\t\t" + this.getWave() + "\n" +
               "\tTotal Health: \t" + String.format("%.2f", waveHealth) + "\n" +
               "\tTotal Damage: \t" + String.format("%.2f", waveDamage) + "\n" +
               "Enemies: \t\t" + this.getEnemies() + "\n" +
                  "\tPeasants: \t\t" + this.getPeasants() + "\n" +
                  "\tBandits: \t\t" + this.getBandits() + "\n" +
                  "\tKnights: \t\t" + this.getKnights() + "\n" +
                  "\tArchers: \t\t" + this.getArchers() + "\n" +
                  "\tCavaliers: \t\t" + this.getCavaliers() + "\n" +
                  "\tAlchemists: \t" + this.getAlchemists() + "\n" +
                  "\tMonks: \t\t\t" + this.getMonks() + "\n" +
                  "\tPriests: \t\t" + this.getPriests() + "\n";
    }
}
