import java.util.Iterator;

public class ArraySet<T> implements Iterable<T>{

    private T[] items;
    private int size;


    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    public Iterator<T> iterator(){
        return null;
//        return new ArraySetIterator();
    }

    private class ArraySetIterator implements Iterator<T>{
        private int wizPos;
        public ArraySetIterator(){

            wizPos = 0;
        }
        public boolean hasNext(){
            return wizPos < size;
        }

        public T next(){
            T returnItem = items[wizPos];
            wizPos += 1;
            return returnItem;
        }


    }


    /* Returns true if this set contains a specified value.
     */
    public boolean contains(T x) {

        for(int i = 0; i < size ;i += 1){
          /*  if(items[i] == null){
                if(x == null) {
                    return true;
                }
                continue;
            }*/
            if(items[i].equals(x)){
                return true;
            }
        }
        return false;
    }

    /* Associates the specified value with the specified key in this map. 
       Throws an IllegalArgumentException if the key is null. */
    public void add(T x) {
       /* if(x == null){
            throw new IllegalArgumentException("ArraySet cannot add null!");
        }*/

        items[size] = x;
        size += 1;

    }

    /* Returns the size of the ArraySet. */
    public int size() {
        return size;
    }

    @Override
    public String toString(){
        String str;
        str = "[";
        for(int i = 0;i < size-1; i+= 1){
            str = str + (String)items[i] + ",";
        }
            str = str + (String)items[size] + "]";

        return str;
    }





    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
//        s.add(null);
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");        
        System.out.println(s.contains("horse"));        
        System.out.println(s.size());

      /*  Iterator<String> seer = s.iterator();
        while(seer.hasNext()){
            System.out.println(seer.next());
        }*/

      /*for(String ss : s){

        System.out.println(ss);
      }*/

      System.out.println(s.toString());

    }

    /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */
}
