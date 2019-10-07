public class ArrayDeque<datatype> {
    public int size;
    public datatype[] items;
    private int nextFirst;
    private int nextLast;

    public ArrayDeque(){
        size = 0;
        items = (datatype[])new Object[8];
        nextFirst = 0;                      //Set first Node at position 4
        nextLast = 1;                       //In order to make two nodes not conflict, set starting position different
    }

    /**function plusOne and minusOne are important helper
     * functions to implement the circular array list.
     *
     * plusOne is for pushing the pointer index forward and
     * circulate to the front if reach the end.
     *
     * minusOne is for pulling the pointer backwards and circulate
     * to the end if reach the front.
     * @param index
     * @return
     */


    public int plusOne(int index){

        index = (index + 1) % items.length;
        return  index;
    }

    public int minusOne(int index){

        index = (index -1 + items.length) % items.length;
        return index;
    }

    public void addFirst(datatype q ){
        if(size == items.length) {
            resize(size * 2);
        }

        items[nextFirst] = q;
        nextFirst = minusOne(nextFirst);

        size = size + 1;

    }

    public void addLast(datatype q){
        if(size == items.length) {
            resize(size * 2);
        }
        items[nextLast] = q;
        nextLast = plusOne(nextLast);

        size = size + 1;


    }

    public datatype removeFirst(){
        if(isLowUsage()){
            resize(items.length / 2);
        }
        nextFirst = plusOne(nextFirst);
        datatype p = items[nextFirst];
        items[nextFirst] = null;

        size = size - 1;

        return p;
    }

    public datatype removeLast(){
        if(isLowUsage()){
            resize(items.length / 2);
        }

        nextLast = minusOne(nextLast);

        datatype p =items[nextLast];
        items[nextLast] = null;
        size = size - 1;

        return p;
    }

    public boolean isLowUsage(){
        double usageRatio = (double)size / (double)items.length;
        return(items.length >= 16 && usageRatio < 0.25);
    }

    public void resize(int capacity){
        datatype[] p = (datatype[]) new Object[capacity];
        int oldIndex = plusOne(nextFirst);
        int newIndex = 0;
        do{
            p[newIndex] = items[oldIndex];
            newIndex ++;
            oldIndex = plusOne(oldIndex);
        }while(oldIndex != nextLast);

        items = p;
        nextFirst = minusOne(0);
        nextLast = newIndex;
    }


    public boolean isEmpty(){

        return size == 0;

    }

    public int size(){

        return size;
    }



    public void printDeque(){
        int i = plusOne(nextFirst);
        while(i != nextLast){
            System.out.print(items[i] + " ");
            i = plusOne(i);
        }
        System.out.println();
    }

    public datatype get(int q){
        if(q >= size){
            System.out.println("Index exceeds array size!!!");
            return null;

        }

        int x = plusOne(nextFirst);
        datatype m = items[x];
        for (int i = 0; i < q; i++){
            x = plusOne(x);
        }

        return items[x];


    }



    public static void main(String[] args) {

    }
}
