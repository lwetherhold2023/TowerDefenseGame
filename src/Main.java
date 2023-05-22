import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // set up Scanner
        Scanner scan = new Scanner(System.in);

        // set up random number generator
        Random random = new Random();

        // set up ArrayLists
        // stores purchased towers
        ArrayList<Thatch> thatchTowers = new ArrayList<Thatch>();
        ArrayList<Wood> woodTowers = new ArrayList<Wood>();
        ArrayList<Stone> stoneTowers = new ArrayList<Stone>();
        ArrayList<Metal> metalTowers = new ArrayList<Metal>();
        ArrayList<Diamond> diamondTowers = new ArrayList<Diamond>();

        // set up variables
        String actionInput = "";
        String output = "";
        int numInput = 0;
        int max = 0;
        int min = 0;
        int randomInt = 0;
        double towerHealth = 0;
        double towerDamage = 0;
        double waveHealth = 0;
        double waveDamage = 0;
        int towers = 0;
        int cash = 5000;
        int lives = 3;
        int waveNum = 0;

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
        System.out.println("\tThatch: \t500");
        Thread.sleep(250);
        System.out.println("\tWood: \t\t2000");
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
        // only accepts numeric input
        try {
            numInput = Integer.parseInt(scan.next());
        } catch (Exception e) {
            System.out.println("\t\tNumber input not detected. Value will default to 0.");
            numInput = 0;
        }
        // ensures player can afford purchase
        while (cash - (500 * numInput) < 0) {
            System.out.println("\t\tNot enough cash. Try again.");
            System.out.print("\tHow many Thatch towers would you like to buy? ");
            // only accepts numeric input
            try {
                numInput = Integer.parseInt(scan.next());
            } catch (Exception e) {
                System.out.println("\t\tNumber input not detected. Value will default to 0.");
                numInput = 0;
            }
        }
        // formatting purchase questions
        if (numInput > 0) {
            System.out.print("\n\n");
        }
        // creates purchased amount of Thatch towers
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
            Thread.sleep(250);
        }
        System.out.print("\tHow many Wood towers would you like to buy? ");
        // only accepts numeric input
        try {
            numInput = Integer.parseInt(scan.next());
        } catch (Exception e) {
            System.out.println("\t\tNumber input not detected. Value will default to 0.");
            numInput = 0;
        }
        // ensures player can afford purchase
        while (cash - (2000 * numInput) < 0) {
            System.out.println("\t\tNot enough cash. Try again.");
            System.out.print("\tHow many Wood towers would you like to buy? ");
            // only accepts numeric input
            try {
                numInput = Integer.parseInt(scan.next());
            } catch (Exception e) {
                System.out.println("\t\tNumber input not detected. Value will default to 0.");
                numInput = 0;
            }
        }
        // formatting purchase questions
        if (numInput > 0) {
            System.out.print("\n\n");
        }
        // creates purchased amount of Wood towers
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
            Thread.sleep(250);
        }
        System.out.print("\tHow many Stone towers would you like to buy? ");
        // only accepts numeric input
        try {
            numInput = Integer.parseInt(scan.next());
        } catch (Exception e) {
            System.out.println("\t\tNumber input not detected. Value will default to 0.");
            numInput = 0;
        }
        // ensures player can afford purchase
        while (cash - (5000 * numInput) < 0) {
            System.out.println("\t\tNot enough cash. Try again.");
            System.out.print("\tHow many Stone towers would you like to buy? ");
            // only accepts numeric input
            try {
                numInput = Integer.parseInt(scan.next());
            } catch (Exception e) {
                System.out.println("\t\tNumber input not detected. Value will default to 0.");
                numInput = 0;
            }
        }
        // formatting purchase questions
        if (numInput > 0) {
            System.out.print("\n\n");
        }
        // creates purchased amount of Stone towers
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
            Thread.sleep(250);
        }
        System.out.print("\tHow many Metal towers would you like to buy? ");
        // only accepts numeric input
        try {
            numInput = Integer.parseInt(scan.next());
        } catch (Exception e) {
            System.out.println("\t\tNumber input not detected. Value will default to 0.");
            numInput = 0;
        }
        // ensures player can afford purchase
        while (cash - (10000 * numInput) < 0) {
            System.out.println("\t\tNot enough cash. Try again.");
            System.out.print("\tHow many Metal towers would you like to buy? ");
            // only accepts numeric input
            try {
                numInput = Integer.parseInt(scan.next());
            } catch (Exception e) {
                System.out.println("\t\tNumber input not detected. Value will default to 0.");
                numInput = 0;
            }
        }
        // formatting purchase questions
        if (numInput > 0) {
            System.out.print("\n\n");
        }
        // creates purchased amount of Metal towers
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
            Thread.sleep(250);
        }
        System.out.print("\tHow many Diamond towers would you like to buy? ");
        // only accepts numeric input
        try {
            numInput = Integer.parseInt(scan.next());
        } catch (Exception e) {
            System.out.println("\t\tNumber input not detected. Value will default to 0.");
            numInput = 0;
        }
        // ensures player can afford purchase
        while (cash - (50000 * numInput) < 0) {
            System.out.println("\t\tNot enough cash. Try again.");
            System.out.print("\tHow many Diamond towers would you like to buy? ");
            // only accepts numeric input
            try {
                numInput = Integer.parseInt(scan.next());
            } catch (Exception e) {
                System.out.println("\t\tNumber input not detected. Value will default to 0.");
                numInput = 0;
            }
        }
        // formatting purchase questions
        if (numInput > 0) {
            System.out.print("\n\n");
        }
        // creates purchased amount of Diamond towers
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
            Thread.sleep(250);
        }
        Thread.sleep(5000);
        System.out.print("\n\n");


        output = "Lives: \t\t\t" + lives + "\n" +
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
        Thread.sleep(2500);


        System.out.println("\nThe game will begin with the first wave, Wave 0.");
        Thread.sleep(3000);
        System.out.println("\nInformation will be listed below.\n");
        Thread.sleep(5000);


        // initializes the enemy wave
        Wave wave = new Wave(0);
        wave.setEnemies();
        wave.create();
        waveHealth = wave.waveHealth;
        waveDamage = wave.waveDamage;
        System.out.println(wave);
        Thread.sleep(5000);


        while (lives != 0) {
            // ask for input of action
            System.out.print("\nWould you like to fight \"f\" or purchase \"p\" more towers? Enter \"stop\" at any time to quit. ");
            actionInput = scan.next();
            Thread.sleep(1250);

            switch(actionInput) {
                case "f":
                    double towerSum = towerHealth + towerDamage;
                    double waveSum = waveHealth + waveDamage;
                    System.out.println("\n");
                    // compares tower and wave health, determines if tower is stronger or not
                    if (towerHealth > waveHealth) {
                        System.out.println("Your towers have more Health than Wave " + waveNum + ".");
                    } else if (towerHealth < waveHealth) {
                        System.out.println("Wave " + waveNum + " has more Health than your towers.");
                    } else {
                        System.out.println("Your towers and Wave " + waveNum + " have equal Health.");
                    }
                    Thread.sleep(1250);

                    // compares tower and wave damage, determines if tower is stronger or not
                    if (towerDamage > waveDamage) {
                        System.out.println("Your towers have more Damage than Wave " + waveNum + ".");
                    } else if (towerHealth < waveHealth) {
                        System.out.println("Wave " + waveNum + " has more Damage than your towers.");
                    } else {
                        System.out.println("Your towers and Wave " + waveNum + " have equal Damage.");
                    }
                    Thread.sleep(1250);

                    // compares the sums of tower and wave stats
                    if (towerSum > waveSum) {
                        // tower has more total stats, CONTINUE AND GAIN CASH
                        max = 17500;
                        min = 1000;
                        randomInt = random.nextInt(max - min + 1) + min;

                        System.out.println("\nYou have defeated Wave " + waveNum + " and earned " + randomInt + " cash.");
                        cash += randomInt;
                        Thread.sleep(1250);
                        System.out.println("You have " + cash + " cash.");
                        Thread.sleep(1250);

                        System.out.println("\nThe game will continue with the next wave, Wave " + (waveNum + 1) + ".");
                        Thread.sleep(1250);
                        System.out.println("\nInformation will be listed below.\n");
                        Thread.sleep(1250);
                        // next wave
                        waveNum++;
                        // changes wave number
                        wave.setWave(waveNum);
                        wave.setEnemies();
                        wave.create();
                        waveHealth = wave.waveHealth;
                        waveDamage = wave.waveDamage;
                        System.out.println(wave);
                    } else {
                        // wave has more total stats, LOSE LIFE
                        // OR
                        // equal total stats, LOSE LIFE
                        lives--;
                        if (lives != 0) {
                            System.out.println("\nWave " + waveNum + " is stronger than or equally as strong as your towers. You have lost a life and will repeat Wave " + waveNum + ".");
                        } else {
                            System.out.println("\nWave " + waveNum + " is stronger than or equally as strong as your towers. You have lost a life and been defeated by Wave " + waveNum + ".");
                        }

                        Thread.sleep(1250);
                        System.out.println("\nYou have " + lives + " lives.");
                        Thread.sleep(1250);

                        // player loses but stil has lives
                        if (lives != 0) {
                            System.out.println("\nThe game will repeat the current wave, Wave " + waveNum + ".");
                            Thread.sleep(1250);
                            System.out.println("\nInformation will be listed below.\n");
                            Thread.sleep(1250);
                            wave.setWave(waveNum);
                            wave.setEnemies();
                            wave.create();
                            waveHealth = wave.waveHealth;
                            waveDamage = wave.waveDamage;
                            System.out.println(wave);
                        }
                    }
                    break;
                case "p":
                    // same as before, but now in a forever loop with user input
                    System.out.println("\nHere are the costs of the tower types:");
                    Thread.sleep(1000);
                    System.out.println("\tThatch: \t500");
                    Thread.sleep(250);
                    System.out.println("\tWood: \t\t2000");
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
                    while (cash - (500 * numInput) < 0) {
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
                        Thread.sleep(250);
                    }
                    System.out.print("\tHow many Wood towers would you like to buy? ");
                    try {
                        numInput = Integer.parseInt(scan.next());
                    } catch (Exception e) {
                        System.out.println("\t\tNumber input not detected. Value will default to 0.");
                        numInput = 0;
                    }
                    while (cash - (2000 * numInput) < 0) {
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
                        Thread.sleep(250);
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
                        Thread.sleep(250);
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
                        Thread.sleep(250);
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
                        Thread.sleep(250);
                    }
                    Thread.sleep(1250);
                    System.out.print("\n\n");


                    output = "Lives: \t\t\t" + lives + "\n" +
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
                    break;
                case "stop":
                    System.exit(0);
                    break;
            }
        }
        // player loses and has run out of lives
        // 0 LIVES LEFT
        System.out.println("\nYou have reached 0 lives.");
        Thread.sleep(1250);
        System.out.println("\nGAME OVER");
        Thread.sleep(2500);
    }
}