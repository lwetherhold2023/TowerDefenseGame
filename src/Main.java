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
        try {
            numInput = Integer.parseInt(scan.next());
        } catch (Exception e) {
            System.out.println("\t\tNumber input not detected. Value will default to 0.");
            numInput = 0;
        }
        while (cash - (1000 * numInput) < 0) {
            System.out.println("\t\tNot enough cash. Try again.");
            System.out.print("\tHow many Thatch towers would you like to buy? ");
            try {
                numInput = Integer.parseInt(scan.next());
            } catch (Exception e) {
                System.out.println("\t\tNumber input not detected. Value will default to 0.");
                numInput = 0;
            }
        }
        if (numInput > 0) {
            System.out.print("\n\n");
        }
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
        try {
            numInput = Integer.parseInt(scan.next());
        } catch (Exception e) {
            System.out.println("\t\tNumber input not detected. Value will default to 0.");
            numInput = 0;
        }
        while (cash - (2500 * numInput) < 0) {
            System.out.println("\t\tNot enough cash. Try again.");
            System.out.print("\tHow many Wood towers would you like to buy? ");
            try {
                numInput = Integer.parseInt(scan.next());
            } catch (Exception e) {
                System.out.println("\t\tNumber input not detected. Value will default to 0.");
                numInput = 0;
            }
        }
        if (numInput > 0) {
            System.out.print("\n\n");
        }
        for (int i = 0; i < numInput; i++) {
            Tower wood = new Wood();
            ((Wood)wood).splinter();
            woodTowers.add((Wood)wood);
            System.out.print(wood);
            System.out.print("\n\n");
            towerHealth += wood.getHealth();
            towerDamage += wood.getDamage();
            cash -= wood.getCost();
            towers++;
        }
        System.out.print("\tHow many Stone towers would you like to buy? ");
        try {
            numInput = Integer.parseInt(scan.next());
        } catch (Exception e) {
            System.out.println("\t\tNumber input not detected. Value will default to 0.");
            numInput = 0;
        }
        while (cash - (5000 * numInput) < 0) {
            System.out.println("\t\tNot enough cash. Try again.");
            System.out.print("\tHow many Stone towers would you like to buy? ");
            try {
                numInput = Integer.parseInt(scan.next());
            } catch (Exception e) {
                System.out.println("\t\tNumber input not detected. Value will default to 0.");
                numInput = 0;
            }
        }
        if (numInput > 0) {
            System.out.print("\n\n");
        }
        for (int i = 0; i < numInput; i++) {
            Tower stone = new Stone();
            ((Stone)stone).bonebreak();
            stoneTowers.add((Stone)stone);
            System.out.print(stone);
            System.out.print("\n\n");
            towerHealth += stone.getHealth();
            towerDamage += stone.getDamage();
            cash -= stone.getCost();
            towers++;
        }
        System.out.print("\tHow many Metal towers would you like to buy? ");
        try {
            numInput = Integer.parseInt(scan.next());
        } catch (Exception e) {
            System.out.println("\t\tNumber input not detected. Value will default to 0.");
            numInput = 0;
        }
        while (cash - (10000 * numInput) < 0) {
            System.out.println("\t\tNot enough cash. Try again.");
            System.out.print("\tHow many Metal towers would you like to buy? ");
            try {
                numInput = Integer.parseInt(scan.next());
            } catch (Exception e) {
                System.out.println("\t\tNumber input not detected. Value will default to 0.");
                numInput = 0;
            }
        }
        if (numInput > 0) {
            System.out.print("\n\n");
        }
        for (int i = 0; i < numInput; i++) {
            Tower metal = new Metal();
            ((Metal)metal).bonebreak();
            ((Metal)metal).passiveDamage();
            metalTowers.add((Metal)metal);
            System.out.print(metal);
            System.out.print("\n\n");
            towerHealth += metal.getHealth();
            towerDamage += metal.getDamage();
            cash -= metal.getCost();
            towers++;
        }
        System.out.print("\tHow many Diamond towers would you like to buy? ");
        try {
            numInput = Integer.parseInt(scan.next());
        } catch (Exception e) {
            System.out.println("\t\tNumber input not detected. Value will default to 0.");
            numInput = 0;
        }
        while (cash - (50000 * numInput) < 0) {
            System.out.println("\t\tNot enough cash. Try again.");
            System.out.print("\tHow many Diamond towers would you like to buy? ");
            try {
                numInput = Integer.parseInt(scan.next());
            } catch (Exception e) {
                System.out.println("\t\tNumber input not detected. Value will default to 0.");
                numInput = 0;
            }
        }
        if (numInput > 0) {
            System.out.print("\n\n");
        }
        for (int i = 0; i < numInput; i++) {
            Tower diamond = new Diamond();
            ((Diamond)diamond).bonebreak();
            ((Diamond)diamond).passiveDamage();
            ((Diamond)diamond).knockback();
            diamondTowers.add((Diamond)diamond);
            System.out.print(diamond);
            System.out.print("\n\n");
            towerHealth += diamond.getHealth();
            towerDamage += diamond.getDamage();
            cash -= diamond.getCost();
            towers++;
        }
        Thread.sleep(1250);
        System.out.print("\n\n");


        String output = "Lives: \t\t\t" + lives + "\n" +
                        "\tYour Health: \t" + String.format("%.2f", towerHealth) + "\n" +
                        "\tYour Damage: \t" + String.format("%.2f", towerDamage) + "\n" +
                        "Cash: \t\t\t" + cash + "\n" +
                        "Towers: \t\t" + towers + "\n" +
                           "\tThatch: \t\t" + thatchTowers.size() + "\n" +
                           "\tWood: \t\t\t" + woodTowers.size() + "\n" +
                           "\tStone: \t\t\t" + stoneTowers.size() + "\n" +
                           "\tMetal: \t\t\t" + metalTowers.size() + "\n" +
                           "\tDiamond: \t\t" + diamondTowers.size() + "\n";
        System.out.println(output);
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