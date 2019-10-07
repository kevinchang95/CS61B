public class ArrayDeque<datatype> {
    private int size;
    private datatype[] items;
    private int nextFirst;
    private int nextLast;

    public ArrayDeque(){
        size = 0;
        items = (datatype[])new Object[8];
        nextFirst = 0;                      //Set first Node at position 4
        nextLast = 1;                       //In order to make two nodes not conflict, set starting position different
    }



    public void resize(int capacity){
        datatype[] p = (datatype[]) new Object[capacity];
        System.arraycopy(items,0,p,0,size);
        items = p;
    }



    public void addFirst(datatype q ){
        if(size == items.length) {
            resize(size * 2);
        }
        items[nextFirst] = q;
        nextFirst = nextFirst - 1;
        if(nextFirst < 0){
            nextFirst = nextFirst + items.length;
        }

        size = size + 1;

    }

    public void addLast(datatype q){
        if(size == items.length) {
            resize(size * 2);
        }
        items[nextLast] = q;
        nextLast = nextLast + 1;
        if(nextLast > items.length - 1){
            nextLast = 0;
        }

        size = size + 1;


        size +=1;
    }

    public LinkedListDeque.Node removeFirst(){
        LinkedListDeque.Node p = sentinel.next;
        if(p == sentinel){
            return null;
        }

        sentinel.next = sentinel.next.next;
        sentinel.next.prev = sentinel;

        size -=1;
        return p;
    }

    public LinkedListDeque.Node removeLast(){

        LinkedListDeque.Node p = sentinel.prev;
        if(p == sentinel){
            return null;
        }
        sentinel.prev = sentinel.prev.prev;
        sentinel.prev.next = sentinel;
        size -=1;
        return p;
    }

    public int size(){

        return size;
    }

    public boolean isEmpty(){

        if(size == 0){
            return true;
        }
        return false;
    }

    public void printDeque(){
        LinkedListDeque.Node p = sentinel.next;
        while(p != sentinel) {
            System.out.print(p.item+" ");
            p = p.next;
        }
        System.out.println();
    }

    public dataType get(int i){
        LinkedListDeque.Node p = sentinel;
        p.next = sentinel.next;
        p.prev = sentinel.prev;

        while(p.next != sentinel){
            p = p.next;
            if(i == 0){

                return p.item;
            }

            i--;
        }

        return null;
    }

    public static void main(String[] args) {

    }
}
