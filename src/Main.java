import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // set up Scanner
        Scanner scan = new Scanner(System.in);

        // set up ArrayLists
        ArrayList<Thatch> thatchTowers = new ArrayList<Thatch>();
        ArrayList<Wood> woodTowers = new ArrayList<Wood>();
        ArrayList<Stone> stoneTowers = new ArrayList<Stone>();
        ArrayList<Metal> metalTowers = new ArrayList<Metal>();
        ArrayList<Diamond> diamondTowers = new ArrayList<Diamond>();

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
        while (cash - (1000 * numInput) < 0) {
            System.out.println("\t\tNot enough cash. Try again.");
            System.out.print("\tHow many Thatch towers would you like to buy? ");
            numInput = scan.nextInt();
        }
        System.out.print("\n\n");
        for (int i = 0; i < numInput; i++) {
            Tower thatch = new Thatch();
            ((Thatch)thatch).sleep();
            thatchTowers.add((Thatch)thatch);
            System.out.print(thatch);
            System.out.print("\n\n");
            towerHealth += thatch.getHealth();
            towerDamage += thatch.getDamage();
            cash -= thatch.getCost();
            towers++;
        }



        System.out.print("\tHow many Wood towers would you like to buy? ");
        numInput = scan.nextInt();
        System.out.print("\tHow many Stone towers would you like to buy? ");
        numInput = scan.nextInt();
        System.out.print("\tHow many Metal towers would you like to buy? ");
        numInput = scan.nextInt();
        System.out.print("\tHow many Diamond towers would you like to buy? ");
        numInput = scan.nextInt();
        Thread.sleep(1250);
        System.out.print("\n\n");


        String output = "Lives: \t\t\t" + lives + "\n" +
                        "Cash: \t\t\t" + cash + "\n" +
                        "Total Health: \t" + String.format("%.2f", towerHealth) + "\n" +
                        "Total Damage: \t" + String.format("%.2f", towerDamage) + "\n" +
                        "Towers: \t\t" + towers + "\n" +
                           "\t\tThatch: \t" + thatchTowers.size() + "\n" +
                           "\t\tWood: \t\t" + woodTowers.size() + "\n" +
                           "\t\tStone: \t\t" + stoneTowers.size() + "\n" +
                           "\t\tMetal: \t\t" + metalTowers.size() + "\n" +
                           "\t\tDiamond: \t" + diamondTowers.size() + "\n";
        System.out.println(output);


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