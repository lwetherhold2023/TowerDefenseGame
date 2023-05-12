import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // set up Scanner
        Scanner scan = new Scanner(System.in);

        // set up variables
        String actionInput = "";
        int numInput = 0;
        double towerHealth = 0;
        double towerDamage = 0;
        int towers = 0;
        int cash = 5000;
        int lives = 3;

        Thread.sleep(500);
        System.out.println("Welcome to the Tower Defense Game!");
        Thread.sleep(1250);
        System.out.println("\nYou will start with " + cash + " cash and " + lives + " lives. You have " + towers + " towers.");
        Thread.sleep(1250);
        System.out.println("\nBy defeating enemies, you earn cash. When tower health reaches 0, you lose a life.");
        Thread.sleep(1250);
        System.out.println("\nBefore we begin, you will need to buy your first tower. Defense is crucial in this game.");
        Thread.sleep(1750);
        System.out.println("\nHere are the costs of the tower types:");
        Thread.sleep(1000);
        System.out.println("\tThatch: \t1000");
        Thread.sleep(250);
        System.out.println("\tWood: \t\t2500");
        Thread.sleep(250);
        System.out.println("\tStone: \t\t5000");
        Thread.sleep(250);
        System.out.println("\tMetal: \t\t10000");
        Thread.sleep(250);
        System.out.println("\tDiamond: \t50000");
        Thread.sleep(1250);
        System.out.println("\nYou have " + cash + " cash.");
        Thread.sleep(1250);
        System.out.print("\tHow many Thatch towers would you like to buy? ");
        numInput = scan.nextInt();
        System.out.print("\tHow many Wood towers would you like to buy? ");
        numInput = scan.nextInt();
        System.out.print("\tHow many Stone towers would you like to buy? ");
        numInput = scan.nextInt();
        System.out.print("\tHow many Metal towers would you like to buy? ");
        numInput = scan.nextInt();
        System.out.print("\tHow many Diamond towers would you like to buy? ");
        numInput = scan.nextInt();
        Thread.sleep(1250);
        System.out.println("\nThe game will begin with the first wave, Wave 0.");
        Thread.sleep(1250);
        System.out.println("\nInformation will be listed below.\n");
        Thread.sleep(2150);



        Wave wave = new Wave(0);
        wave.setEnemies();
        wave.create();
        System.out.println(wave);

        wave.setWave(25);
    }

    public void nextWave() {

    }
}