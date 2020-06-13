package creatures;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.awt.Color;
import huglife.Direction;
import huglife.Action;
import huglife.Occupant;
import huglife.Impassible;
import huglife.Empty;


public class TestClorus {

    @Test
    public void testConstructor(){

        Clorus c = new Clorus(1.2);
        assertEquals(c.energy(),1.2,0.01);
        c = new Clorus();
        assertEquals(c.energy(),1.0,0.01);
        assertEquals(c.name(),"clorus");


    }

    @Test
    public void testColor(){

        Clorus c = new Clorus(1.2);
        Color testColor = new Color(34,0,231);
        assertEquals(testColor,c.color());

    }

    @Test
    public void testEnergy(){

        Clorus c = new Clorus(1.2);
        c.move();
        assertEquals(c.energy(),1.17,0.001);
        c.stay();
        assertEquals(c.energy(),1.16,0.001);


    }

    @Test
    public void testReplicate(){

        Clorus c = new Clorus(1.2);
        Clorus babyClorus = c.replicate();
        assertEquals(c.energy(),0.6,0.001);

        assertEquals(babyClorus.energy(),c.energy(),0.001);


    }

    @Test
    public void testStay() {

        // No empty adjacent spaces; stay.
        Clorus c = new Clorus(1.2);
        HashMap<Direction, Occupant> surrounded = new HashMap<Direction, Occupant>();
        surrounded.put(Direction.TOP, new Impassible());
        surrounded.put(Direction.BOTTOM, new Impassible());
        surrounded.put(Direction.LEFT, new Impassible());
        surrounded.put(Direction.RIGHT, new Impassible());

        Action actual = c.chooseAction(surrounded);
        Action expected = new Action(Action.ActionType.STAY);

        assertEquals(expected, actual);
        assertEquals(c.energy(),1.19,0.001);

    }

    @Test
    public void testAttack() {

        // No empty adjacent spaces; stay.
        Clorus c = new Clorus(1.2);
        HashMap<Direction, Occupant> surrounded = new HashMap<Direction, Occupant>();
        surrounded.put(Direction.TOP, new Plip(0.6));
        surrounded.put(Direction.BOTTOM, new Empty());
        surrounded.put(Direction.LEFT, new Impassible());
        surrounded.put(Direction.RIGHT, new Impassible());

        Action actual = c.chooseAction(surrounded);
        Action expected = new Action(Action.ActionType.ATTACK,Direction.TOP);

        assertEquals(expected, actual);
        assertEquals(c.energy(),1.8,0.001);

    }
    @Test
    public void testChooseReplicate() {

        // No empty adjacent spaces; stay.
        Clorus c1 = new Clorus(1.2);
        Clorus c2 = new Clorus(0.8);
        HashMap<Direction, Occupant> surrounded = new HashMap<Direction, Occupant>();
        surrounded.put(Direction.TOP, new Empty());
        surrounded.put(Direction.BOTTOM, new Impassible());
        surrounded.put(Direction.LEFT, new Impassible());
        surrounded.put(Direction.RIGHT, new Impassible());

        Action actual = c1.chooseAction(surrounded);
        Action expected = new Action(Action.ActionType.REPLICATE,Direction.TOP);

        assertEquals(expected, actual);

        actual = c2.chooseAction(surrounded);
        expected = new Action(Action.ActionType.MOVE,Direction.TOP);

        assertEquals(expected, actual);



    }

}
