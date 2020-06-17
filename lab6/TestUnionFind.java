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

        UnionFind uf = new UnionFind(9);
        uf.union(0,1);
        uf.union(1,8);
        uf.union(2,0);
        uf.union(3,4);
        uf.union(5,4);
        assertFalse(uf.connected(2,4));
        assertEquals(4,uf.sizeOf(2));
        assertEquals(3,uf.sizeOf(4));
        assertEquals(1,uf.sizeOf(6));
        uf.union(4,2);
        assertEquals(7,uf.sizeOf(4));


    }





}
