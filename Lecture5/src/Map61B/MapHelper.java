package Map61B;

import java.util.List;

public class MapHelper {

    public static <K,V> V get(Map61B<K,V> m, K key){
        if(m.containsKey(key)){

            return m.get(key);

        }

        return null;
    }


    public static <K extends Comparable<K>,V> K maxKey(Map61B<K,V> m ){
        List<K> klist = m.keys();
        K largest = klist.get(0);
        for(K k: klist){
            if(k.compareTo(largest) > 0){

                largest = k;
            }

        }

        return largest;
    }

}
