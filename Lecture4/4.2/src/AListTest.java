import org.junit.Test;
import static org.junit.Assert.*;

public class AListTest {

    @Test
    public void TestConstructor(){
        String[] m = {"I","have","an","egg"};
        AList<String> input = new AList<>(m);
        String[] expected = {"I","have","an","egg"};

        assertArrayEquals(input.items,expected);
    }
    @Test
    public void testAddfirst(){
        String[] m = {"I","have","an","egg"};
        AList<String> input = new AList<>(m);
//        String expected[] = new String[input.items.length];
        String[] expected = {"pie","I","have","an","egg",null,null,null,null};
        input.AddFirst("pie");

        assertArrayEquals(input.items,expected);

    }


}
