/** Array based list.
 *  @author Josh Hug
 */

public class AList<T> implements List61B<T>{

    T[] items = (T[])new Object[100];
    private int size;

    /**Creates an empty list. */
    public AList() {

        size = 0;

    }
    @Override
    public void addFirst(T x){
        if(size == items.length){
            resize(size * size);
        }

        System.arraycopy(items,0,items,1,size);
        items[0] = x;


        /*for(int i=0; i < size; i++){
           items[size + 1] = items;
        }*/

        size = size + 1;

    }
    @Override
    public T getFirst(){

        return items[0];


    }

    @Override
    /** Inserts X into the back of the list. */
    public void addLast(T x) {
        if(size == items.length){
            resize(size * size);
        }

        items[size] = x;
        size = size + 1;

    }

    private void resize(int capacity){

        T[] a = (T[])new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;

    }
    @Override
    /** Returns the item from the back of the list. */
    public T getLast() {


        return items[size - 1];
    }
    @Override
    /** Gets the ith item in the list (0 is the front). */
    public T get(int i) {

        return items[i];
    }
    @Override
    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }
    @Override
    /** Deletes item from back of the list and
      * returns deleted item. */
    public T removeLast() {
        T l = items[size - 1];
        //items[size - 1] = 0;        //Not necessary since not break the invariants.
        size = size - 1;
        return l;
    }
    @Override
    public void insert(T item, int position){

        if(position >= size){addLast(item);}
        if(size == items.length){
            resize(size * size);
        }

        System.arraycopy(items,0,items,0,position - 1);
        System.arraycopy(items,position,items,position + 1,size - position);
        items[position] = item;
        size = size + 1;
    }

    public void printList(){

        for(int i = 0; i < size; i++){

            System.out.print(items[i] + " ");
        }

        System.out.println();

    }


    public static void main(String[] args){

        AList<Integer> L = new AList<>();

        L.addFirst(1);
        L.addLast(2);
        L.addLast(3);
        L.insert(0,2);
        L.printList();

    }

} 