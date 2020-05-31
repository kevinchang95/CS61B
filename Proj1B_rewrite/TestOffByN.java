import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByN {


    static CharacterComparator offByN = new OffByN(5);

    // Your tests go here.
    @Test
    public void testequalChars() {

        assertTrue(offByN.equalChars('a', 'f'));
        assertTrue(offByN.equalChars('u', 'z'));
//        assertTrue(offByN.equalChars('$', '$'));
        assertFalse(offByN.equalChars('a', 'b'));
        assertFalse(offByN.equalChars('a', ' '));
        assertFalse(offByN.equalChars('a', 'z'));

    }
}
