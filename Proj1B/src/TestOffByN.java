import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByN {

    static CharacterComparator offByOne1 = new OffByN(5);
    static CharacterComparator offByOne2 = new OffByN(10);

    @Test
    public void testequalChars(){
        assertFalse(offByOne1.equalChars('a','b'));
        assertTrue(offByOne1.equalChars('f','a'));
        assertTrue(offByOne2.equalChars('k','a'));
        assertFalse(offByOne2.equalChars('%','a'));

    }



}
