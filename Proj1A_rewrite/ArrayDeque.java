public class ArrayDeque<T> {

    T[] items;
    int nextFirst;
    int nextLast;
    int size;

    public ArrayDeque(){

        items = (T[]) new Object[8];
        size = 0;
        nextFirst = 0;
        nextLast = 1;
    }

    private void sizeup(){

        resize(size * 2);

    }

    private void sizedown(){

        resize(size / 2);

    }

    private void resize(int capacity){

        /*if(nextLast == 0) nextFirst = 1;
        if(nextFirst == 1) nextLast = 0;*/

        int oldLen = items.length;

        T[] a = (T[]) new Object[capacity];
        if(capacity > items.length) {
            System.arraycopy(items, 0, a, 0, nextFirst + 1);
            System.arraycopy(items, nextLast, a, a.length - (items.length - nextLast), (items.length - nextLast));

            items = a;
            nextLast = nextFirst + 1;
            nextFirst = nextFirst + oldLen;
        }else{
            System.arraycopy(items, plusOne(nextFirst), a, plusOne(nextFirst) % capacity, capacity - nextFirst);
            System.arraycopy(items, nextLast, a, a.length - (items.length - nextLast), (items.length - nextLast));


        }

    }

    public int plusOne(int index){

        return (index + 1) % items.length;

    }

    public int minusOne(int index){

        return (index - 1 + items.length) % items.length;
    }

    public void addFirst(T item){
        if(size == items.length){

           sizeup();
        }

        items[nextFirst] = item;
        nextFirst = minusOne(nextFirst);


        size = size + 1;

    }

    public void addLast(T item){

        if(size == items.length){

            sizeup();
        }

        items[nextLast] = item;
        nextLast = plusOne(nextLast);

        size = size + 1;


    }


    public T removeFirst(){
        double userRatio = (double) size / (double) items.length;
        if(userRatio < 0.25 && items.length > 8){

            sizedown();
        }

        T f;
        nextFirst = plusOne(nextFirst);
        f = items[nextFirst];
        size = size - 1;

        return f;


    }

    public T removeLast(){
        double userRatio = (double) size / (double) items.length;
        if( userRatio < 0.25 && items.length > 8){

            sizedown();
        }

        T f;
        nextLast = minusOne(nextLast);
        f = items[nextLast];
        size = size - 1;

        return f;


    }

    public static void main(String[] args){

        ArrayDeque<Integer> aList1 = new ArrayDeque<>();
      /*  aList1.addFirst(5);
        aList1.addFirst(4);
        aList1.addFirst(3);
        aList1.addLast(6);
        aList1.addLast(7);
        aList1.addLast(8);
        aList1.addLast(9);
        aList1.addLast(10);
        aList1.addLast(11);
        aList1.addFirst(2);
        aList1.addFirst(1);*/

        aList1.addFirst(8);
        aList1.addFirst(7);
        aList1.addFirst(6);
        aList1.addFirst(5);
        aList1.addFirst(4);
        aList1.addFirst(3);
        aList1.addFirst(2);
        aList1.addFirst(1);
        aList1.addFirst(0);
        aList1.addFirst(-1);
        aList1.addFirst(-2);
        aList1.removeLast();
        aList1.removeLast();
        aList1.removeLast();
        aList1.removeLast();
        aList1.removeLast();
        aList1.removeLast();
        aList1.removeLast();
        aList1.removeLast();
        aList1.addFirst(-3);
        aList1.addFirst(-4);
        aList1.addFirst(-5);
        aList1.addFirst(-6);
        aList1.addFirst(-7);
        aList1.addFirst(-8);
        aList1.addFirst(-9);
    }

}
