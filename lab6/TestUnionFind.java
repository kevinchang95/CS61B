import org.junit.Test;
import static org.junit.Assert.*;

public class TestUnionFind {


    @Test
    public void testConstructor(){

        UnionFind uf = new UnionFind(5);

        assertEquals(-1,uf.items[0]);
        assertEquals(-1,uf.items[1]);
        assertEquals(-1,uf.items[2]);


    }

    @Test
    public void testConnect(){

        UnionFind uf = new UnionFind(5);
        uf.union(2,4);
        assertTrue(uf.connected(2,4));
        assertEquals(2,uf.sizeOf(2));
        assertEquals(2,uf.sizeOf(4));
        assertEquals(1,uf.sizeOf(1));
        uf.union(4,2);
        assertEquals(3,uf.sizeOf(4));


    }





}
