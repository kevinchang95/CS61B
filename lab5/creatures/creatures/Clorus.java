package creatures;

import huglife.Creature;
import huglife.Direction;
import huglife.Action;
import huglife.Occupant;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Random;

public class Clorus extends Creature{

    /**
     * red color.
     */
    private int r;
    /**
     * green color.
     */
    private int g;
    /**
     * blue color.
     */
    private int b;


    public Clorus(double e){

        super("clorus");
        r = 0;
        g = 0;
        b = 0;
        energy = e;

    }

    public Clorus(){

        this(1);

    }

    public Color color(){

        r = 34;
        g = 0;
        b = 231;

        return new Color(r,g,b);
    }


    public void move(){

        energy -= 0.03;
        energyCheck();
    }

    public void stay(){

        energy -= 0.01;
        energyCheck();
    }

    private void energyCheck(){

        if(energy < 0) energy = 0;

    }

    public Clorus replicate(){

        energy = 0.5 * energy;

        Clorus babyClorus = new Clorus(energy);

        return babyClorus;

    }

    public void attack(Creature c){

        energy += c.energy();


    }

    public Action chooseAction(Map<Direction,Occupant> neighbors){

        Deque<Direction> emptyNeighbors = new ArrayDeque<>();
        Deque<Direction> occupantNeighbors = new ArrayDeque<>();
        Deque<Direction> plipNeighbors = new ArrayDeque<>();
        for(Map.Entry<Direction,Occupant> entry: neighbors.entrySet()){

            String occupantName = entry.getValue().name();
            if(occupantName == "empty"){

                emptyNeighbors.add(entry.getKey());
            }
            else {

                occupantNeighbors.add(entry.getKey());

                if (occupantName == "plip") {

                    plipNeighbors.add(entry.getKey());
                }

            }
        }


        //Rule1: if no empty space, clorus will STAY.

        if(emptyNeighbors.size() == 0){

            stay();
            return new Action(Action.ActionType.STAY);

        }
        else if(plipNeighbors.size() != 0){

            Direction plipDirec = getRandomElement(plipNeighbors);
            Plip targetPlip = (Plip)neighbors.get(plipDirec);
            attack(targetPlip);

            return new Action(Action.ActionType.ATTACK,plipDirec);
        }
        else if(energy >= 1.0){

            Direction repDirec = getRandomElement(emptyNeighbors);
            replicate();

            return new Action(Action.ActionType.REPLICATE,repDirec);

        }


        Direction movDirec = getRandomElement(emptyNeighbors);
        move();
        return new Action(Action.ActionType.MOVE,movDirec);


    }


    private <T> T getRandomElement(Deque<T> deque)
    {
        T[] list = (T[])deque.toArray();
        Random rand = new Random();
        int ranIndex = rand.nextInt(list.length);
        return list[ranIndex];

    }


}
