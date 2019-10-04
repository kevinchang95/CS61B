public class NaiveAList {

    int size;
    int[] item ;

    /** Creates an empty list. */
    public NaiveAList() {
        size = 0;
        item = new int[100];
    }

    private void resize(int capacity){
        int[]  q = new int[capacity * 2];
        System.arraycopy(item,0,q,0,size);
        item = q;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if(size == item.length){
            resize(size + 1);
        }
            item[size] = x;
            size += 1;

    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return item[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return item[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Invariants in the Alist:
     * 1.The position of the next item to be added is always position.
     * 2.The number of items in the AList is always size.
     * 3.The position of the last item in the list is always size-1.
     */

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int removeLast() {
        int p = item[size - 1];
        size -= 1;

        return item[size + 1];
    }





}
