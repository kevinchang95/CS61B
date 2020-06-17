public class UnionFind{

    // TODO - Add instance variables?

    /**rank is the # of nodes*/
//    int rank;

    public int[] items;

    /* Creates a UnionFind data structure holding n vertices. Initially, all
       vertices are in disjoint sets. */
    public UnionFind(int n) {
        // TODO

        items = new int[n];

        for(int i = 0; i< items.length; i +=1){

            items[i] = -1;

        }

    }



    /* Throws an exception if v1 is not a valid index. */
    private void validate(int vertex) {
        // TODO

        if(vertex < 0 || vertex >= items.length){

            throw new IllegalArgumentException("the index " + vertex + " exceed the set size!!!");

        }

    }

    /* Returns the size of the set v1 belongs to.
    *  The size of the tree will be stored inside the parent node*/
    public int sizeOf(int v1) {
        // TODO
        validate(v1);
        int root = find(v1);
        return -items[root];
    }

    /* Returns the parent of v1. If v1 is the root of a tree, returns the
       negative size of the tree for which v1 is the root. */
    public int parent(int v1) {
        // TODO


        validate(v1);
        return items[v1];

    }

    /* Returns true if nodes v1 and v2 are connected. */
    public boolean connected(int v1, int v2) {
        // TODO
        validate(v1);
        validate(v2);
        return (find(v1) == find(v2));

    }

    private int size(int v) {

        int root = find(v);
        return Math.abs(items[root]);
    }

    /* Connects two elements v1 and v2 together. v1 and v2 can be any valid 
       elements, and a union-by-size heuristic is used. If the sizes of the sets
       are equal, tie break by connecting v1's root to v2's root. Unioning a 
       vertex with itself or vertices that are already connected should not 
       change the sets but may alter the internal structure of the data. */
    public void union(int v1, int v2) {
        // TODO

        int root1 = find(v1);
        int root2 = find(v2);
        
        if(v1 == v2) return;

        int size1 = size(v1);
        int size2 = size(v2);


        if(size1 <= size2){

            items[root1] = root2;
            items[root2] = -(size1 + size2);

        }else{

            items[root2] = root1;
            items[root1] = -(size1 + size2);
        }

    }

    /* Returns the root of the set V belongs to. Path-compression is employed
       allowing for fast search-time. */
    public int find(int vertex) {
        // TODO

        int parent = items[vertex];
        if(parent < 0) return vertex;


        return find(parent);
    }

}
