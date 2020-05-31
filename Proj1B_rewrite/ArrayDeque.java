public class ArrayDeque<T> implements Deque<T>{

    T[] items;
    int nextFirst;
    int nextLast;
    int size;

    /**Empty ArrayDeque Constructor*/
    public ArrayDeque(){

        items = (T[]) new Object[8];
        size = 0;
        nextFirst = 0;
        nextLast = 1;
    }

    /**ArrayDeque Constructor that do direct copy*/

    public ArrayDeque(ArrayDeque other){

        items = (T[]) new Object[other.items.length];

        for(int i = 0; i < other.size(); i++){

            items[i] = (T) other.get(i);

        }

        nextFirst = items.length - 1;
        nextLast = plusOne(other.size() - 1);

    }



    private void sizeup(){

        resize(items.length * 2);

    }

    private void sizedown(){

        resize(items.length / 2);

    }

   /* private void resize(int capacity){

        *//*if(nextLast == 0) nextFirst = 1;
        if(nextFirst == 1) nextLast = 0;*//*

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

    }*/
    private void resize(int capacity){

        T[] a = (T[]) new Object[capacity];
        int start = plusOne(nextFirst);
        int end = minusOne(nextLast);
        int j = start;

        for(int i = 0; i < size; i ++){

            a[i] = items[j];
            j = plusOne(j);

        }

        items = a;
        nextFirst = a.length - 1;
        nextLast = size;


    }

    private int plusOne(int index){

        return (index + 1) % items.length;

    }

    private int minusOne(int index){

        return (index - 1 + items.length) % items.length;
    }

    @Override
    public void addFirst(T item){
        if(size == items.length){

           sizeup();
        }

        items[nextFirst] = item;
        nextFirst = minusOne(nextFirst);


        size = size + 1;

    }
    @Override
    public void addLast(T item){

        if(size == items.length){

            sizeup();
        }

        items[nextLast] = item;
        nextLast = plusOne(nextLast);

        size = size + 1;


    }

    @Override
    public T removeFirst(){

        if(size == 0)return null;
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
    @Override
    public T removeLast(){

        if(size == 0)return null;
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


    @Override
    public T get (int index){

        int i = (nextFirst + 1 + index) % items.length;
        return (items[i]);


    }
    @Override
    public int size(){

        return size;

    }
    @Override
    public void printDeque(){

        int j = plusOne(nextFirst);

        for(int i = 0; i < size; i++){

            System.out.print(items[j] + " ");
            j = plusOne(j);

        }

        System.out.println();

    }


    @Override
    public boolean isEmpty(){

        return(size == 0);

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
        ArrayDeque aList2 = new ArrayDeque(aList1);
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
        aList1.removeLast();
        aList1.addFirst(-3);
        aList1.addFirst(-4);
        aList1.addFirst(-5);
        aList1.addFirst(-6);
        aList1.addFirst(-7);
        aList1.addFirst(-8);
        aList1.addFirst(-9);

        aList1.printDeque();

    }

}
