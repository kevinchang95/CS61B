import com.sun.jdi.ArrayReference;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArraySet<T> implements Iterable<T>{

    private T[] items;

    private int size;


    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    public Iterator<T> iterator(){
//        return null;
        return new ArraySetIterator();
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

//    @Override

    /**DIY dummy method of toString()*/
 /*   public String toString(){
        String str;
        str = "[";
        for(int i = 0;i < size-1; i+= 1){
            str = str + (String)items[i] + ",";
        }
            str = str + (String)items[size] + "]";

        return str;
    }*/
    @Override
    /**This to String method will be called automatically in the println(Object x) method!*/

    /*public String toString(){

        String str = "{";
        for(T item : this){         //Caution: Using "this" because for iterable items, there is only one iterable object!
           str += item.toString();
           str += ",";
        }
        str = str += "}";

        return str;
    }*/

    /**Use String builder*/
 /*   public String toString(){

        StringBuilder strSB = new StringBuilder();
        strSB.append("{");
        for(int i = 0; i<size -1; i += 1) {

            strSB.append(items[i].toString() + ",");

        }
        strSB.append(items[size - 1].toString()+"}");

        return strSB.toString();

    }*/

    /**Use method of String: join*/
    public String toString(){

        List<String> listOfItems = new ArrayList<>();
        for (T item : this){
            listOfItems.add(item.toString());
        }

        return "{" + String.join(",",listOfItems) + "}";

    }

    /**Creating method of using varArg*/
    public static <Glorp> ArraySet<Glorp> of(Glorp ... items){

        ArraySet<Glorp> returnSet = new ArraySet<>();
        for (Glorp item : items){
            returnSet.add(item);
        }

        return returnSet;
    }

    @Override
    /** Remember: the signature should be EXACTLY the same to get rid of the override issue!*/
    public boolean equals(Object other){

        if(other == this){
            return true;
        }
        if(other.getClass()!= this.getClass()){
            return false;
        }

        ArraySet<T> q = (ArraySet<T>) other;
        if(this.size != q.size){
            return false;
        }

        for(T item: this){

            if(!q.contains(item)){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
//        s.add(null);
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish2");
        System.out.println(s.contains("horse"));        
        System.out.println(s.size());

        ArraySet<String> s1 = new ArraySet<>();

        s1.add("fish");
        s1.add("house");
        s1.add("fish2");
        s1.add("horse");

      /*  Iterator<String> seer = s.iterator();
        while(seer.hasNext()){
            System.out.println(seer.next());
        }*/

      for(String ss : s){

        System.out.println(ss);
      }

      System.out.println(s);
      System.out.println(s.equals(s1));
      System.out.println(s.equals("fish"));

      ArraySet<String> s2 = ArraySet.of("fish","fish2","horse","house");

      System.out.println(s.equals(s2));
    }

    /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */
}
