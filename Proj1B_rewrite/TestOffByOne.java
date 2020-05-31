import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByOne {
    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator offByOne = new OffByOne();

    // Your tests go here.
    @Test
    public void testequalChars(){

        assertTrue(offByOne.equalChars('a','a'));
        assertTrue(offByOne.equalChars(' ',' '));
        assertTrue(offByOne.equalChars('$','$'));
        assertFalse(offByOne.equalChars('a','b'));
        assertFalse(offByOne.equalChars('a',' '));
        assertFalse(offByOne.equalChars('$','&'));

    }





} /**Uncomment this class once you've created your CharacterComparator interface and OffByOne class. */