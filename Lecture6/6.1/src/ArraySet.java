public class ArraySet<T> {

    private T[] items;
    private int size;


    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /* Returns true if this set contains a specified value.
     */
    public boolean contains(T x) {


        for(int i = 0; i < size ;i += 1){
            if(items[i].equals(x)){
                return true;
            }
        }
        return false;
    }

    /* Associates the specified value with the specified key in this map. 
       Throws an IllegalArgumentException if the key is null. */
    public void add(T x) {
        if(x == null){
            throw new IllegalArgumentException("ArraySet cannot add null!");
        }

        items[size] = x;
        size += 1;

    }

    /* Returns the size of the ArraySet. */
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
        s.add(null);
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");        
        System.out.println(s.contains("horse"));        
        System.out.println(s.size());       
    }

    /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */
}
