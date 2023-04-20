public class Main {
    public static void main(String[] args) {
        // set up variables
        int cash = 5000;
        int lives = 3;
        double towerHealth = 0;
        double towerDamage = 0;

        Wave wave = new Wave(0, 5);
        wave.setEnemies(5);
        wave.create();
    }
}