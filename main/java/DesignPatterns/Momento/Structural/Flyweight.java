package DesignPatterns.Momento.Structural;
// use of hashmap to reuse conterstrike players
import java.util.Random;
import java.util.HashMap;

// A common interface for all players
interface Player
{
    public void assignWeapon(String weapon);
    public void mission();
}

// Terrorist must have weapon and mission
class Terrorist implements Player
{
    // Intrinsic Attribute
    private final String TASK;

    // Extrinsic Attribute
    private String weapon;

    public Terrorist()
    {
        TASK = "PLANT A BOMB";
    }
    public void assignWeapon(String weapon)
    {
        // Assign a weapon
        this.weapon = weapon;
    }
    public void mission()
    {
        //Work on the Mission
        System.out.println("Terrorist with weapon "
                + weapon + "|" + " Task is " + TASK);
    }
}

// CounterTerrorist must have weapon and mission
class CounterTerrorist implements Player
{
    // Intrinsic Attribute
    private final String TASK;

    // Extrinsic Attribute
    private String weapon;

    public CounterTerrorist()
    {
        TASK = "DIFFUSE BOMB";
    }
    public void assignWeapon(String weapon)
    {
        this.weapon = weapon;
    }
    public void mission()
    {
        System.out.println("Counter Terrorist with weapon "
                + weapon + "|" + " Task is " + TASK);
    }
}

class PlayerFactory
{
    private static HashMap <String, Player> hm =
            new HashMap<String, Player>();

    public static Player getPlayer(String type)
    {
        Player p = null;

        if (hm.containsKey(type))
            p = hm.get(type);
        else
        {
            /* create an object of TS/CT  */
            switch(type)
            {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    p = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    p = new CounterTerrorist();
                    break;
                default :
                    System.out.println("Unreachable code!");
            }

            // Once created insert it into the HashMap
            hm.put(type, p);
        }
        return p;
    }
}

// Driver class
public class Flyweight
{

    private static String[] playerType =
            {"Terrorist", "CounterTerrorist"};
    private static String[] weapons =
            {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};


    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++)
        {
            Player p = PlayerFactory.getPlayer(getRandPlayerType());

            p.assignWeapon(getRandWeapon());

            p.mission();
        }
    }

    public static String getRandPlayerType()
    {
        Random r = new Random();

        // Will return an integer between [0,2)
        int randInt = r.nextInt(playerType.length);

        // return the player stored at index 'randInt'
        return playerType[randInt];
    }
    public static String getRandWeapon()
    {
        Random r = new Random();

        // Will return an integer between [0,5)
        int randInt = r.nextInt(weapons.length);

        // Return the weapon stored at index 'randInt'
        return weapons[randInt];
    }
}

