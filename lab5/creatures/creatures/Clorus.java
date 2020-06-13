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

        return null;

    }

    public void attack(Creature c){




    }

    public Action chooseAction(Map<Direction,Occupant> neighbors){


        return null;

    }



}
