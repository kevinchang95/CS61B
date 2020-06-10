import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

/**This is the Array implementation*/
public class ArraySet<T> implements Iterable<T>{

    private T[] items;
    private int size;

    public ArraySet() {

        items = (T[])new Object[100];
        size = 0;

    }

    /**Implement a self-made iterator*/
    private class arraySetIterator implements Iterator<T>{
    /**Caution: arraySetIterator is not generics! So don't add <T> on it.
     * Or it will cause type casting error.*/
        int pos;

        public arraySetIterator(){

            pos = 0;
        }


        @Override
        public boolean hasNext(){

            return(pos < size);

        }

        @Override
        public T next(){

            T returnItem = items[pos];
            pos +=1;
            return returnItem;

        }

    }
    @Override
    public Iterator<T> iterator(){

        return new arraySetIterator();

    }

    /* Returns true if this map contains a mapping for the specified key.
     */
    public boolean contains(T x) {

        for(int i = 0; i < size; i+=1){
            if(items[i] == x)return true;
        }
        return false;
    }

    /* Associates the specified value with the specified key in this map.
       Throws an IllegalArgumentException if the key is null. */
    public void add(T x) {
        if(!contains(x)) {
            items[size] = x;
            size += 1;
        }
    }

    /* Returns the number of key-value mappings in this map. */
    public int size() {

        return size;

    }

    /**Use naive String concatenation*/
/*    @Override
    public String toString(){

//        String stringItem = null;
        String stringItem = "{";
        for(int i = 0; i < size; i+=1){

            stringItem += items[i];
            stringItem += ", ";
        }
        stringItem += "}";

        return stringItem;
    }*/

    /**Use StringBuilder*/
    @Override
    public String toString(){

//        String stringItem = null;
        StringBuilder sbItem = new StringBuilder("{");
//        sbItem.append("{");
        for(int i = 0; i < size; i+=1){

            sbItem.append(items[i]);
            sbItem.append(", ");
        }
        sbItem.append("}");

        return sbItem.toString();
    }

    @Override
    public boolean equals(Object o){

        if(o == null)return false;
        if(this.getClass() != o.getClass())return false;
        ArraySet<T> aSetO = (ArraySet<T>) o;
        if(size != aSetO.size) return false;

        /**Caution: item should iterate through the whole ArraySet instead of items[]!!!!*/
        for (T item: this){

            if(!aSetO.contains(item))return false;

        }

        return true;

    }
    /**directly iterate the items will reach all the null values*/
    /**Deprecated*/
    /*public void printSet(){

        for(T e: items){

            System.out.print(e + " ");
            System.out.println();
        }

    }*/


    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
//        s.add(null);
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");

        ArraySet<String> s2 = new ArraySet<>();

        s2.add("horse");
        s2.add("house");
        s2.add("fish");
        System.out.println(s.contains("horse"));
        System.out.println(s.size());

        /*Iterator<String> seer = s.iterator();

        while(seer.hasNext()){

            System.out.print(seer.next() + " ");
        }*/

        for(String element : s){

            System.out.println(element);
        }

        System.out.println(s.toString());
//        s.printSet();
        System.out.println(s.equals(s2));
    }

    /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */
}


/**This is the set implementation*/
/*
public class ArraySet<T> {

    private Set<T> items;
    private int size;

    public ArraySet() {

        items = new HashSet<T>();
        size = 0;

    }

    */
/* Returns true if this map contains a mapping for the specified key.
     *//*

    public boolean contains(T x) {

        return items.contains(x);
    }

    */
/* Associates the specified value with the specified key in this map.
       Throws an IllegalArgumentException if the key is null. *//*

    public void add(T x) {

        items.add(x);
        size += 1;

    }

    */
/* Returns the number of key-value mappings in this map. *//*

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

    */
/* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    *//*

}
*/
