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








}
