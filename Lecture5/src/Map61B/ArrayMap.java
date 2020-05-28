package Map61B;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayMap<K, V> implements Map61B<K, V>{
    private K[] keys;
    private V[] values;
    int size;

    public ArrayMap(){

        keys = (K[]) new Object[100];
        values =(V[]) new Object[100];
        size = 0;

    }


    private int keyIndex(K key){
        for(int i =0; i<size; i +=1){
            if(keys[i].equals(key)) {
                return i;
            }

        }
        return -1;
    }

    public boolean containsKey(K key){

        return (keyIndex(key) > -1);

    }

    public void put(K key, V value){
        int kindex =keyIndex(key);
        if(kindex > -1){
            values[kindex] = value;
        }else{
            keys[size] = key;
            values[size] = value;
            size += 1;
        }


    }

    public V get(K key){

        return values[keyIndex(key)];

    }

    public int size(){

        return size;
    }

    public List<K> keys(){

        List<K> l = new ArrayList<>();

        for(int i = 0; i< size; i += 1){

            l.add(keys[i]);

        }

        return l;
    }

    @Test
    public void test(){

        ArrayMap<String,Integer> am = new ArrayMap<String,Integer>();

        am.put("cow",4);
        am.put("human",2);
        am.put("fish", 0);
        int fish = 0;

        assertEquals( fish,(long)am.get("fish"));

    }


    public static void main(String[] args) {

    ArrayMap<String,Integer> am = new ArrayMap<String, Integer>();

    am.put("cow",4);
    am.put("human",2);
    am.put("fish", 0);
    int fish = 0;

    assertEquals((Integer)fish,am.get("fish"));

    System.out.println(MapHelper.maxKey(am));

   /* String str = "ThisString";
    str = "ChangeIt!";
    System.out.println(str);*/


    }

}