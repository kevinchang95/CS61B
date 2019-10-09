public class Sort {

    /**Selection sort contains following functions:
     * 1.Select the smallest element
     * 2.Swap the first element and the smallest
     * 3.selection sort for next N-1 elements
     * @param
     */

    public static int findSmallest(String[] s, int start){

        int smallestIndex = start;
        for (int i = start; i < s.length; i++){
            int cmp = s[i].compareTo(s[smallestIndex]);
            if(cmp < 0){
                smallestIndex = i;
            }

        }

        return smallestIndex;
    }

    public static String[] swap(String[]s, int a, int b){
        String temp;
        temp = s[a];
        s[a] = s[b];
        s[b]= temp;

        return s;
    }


    private static void sort(String[] q, int start){
        if(start == q.length){
            return;
        }
        int smallestIndex = findSmallest(q,start);
        swap(q,smallestIndex,start);

        sort( q,start+1);


    }

    public static void sort(String[] q){

        sort(q,0);


    }
}
