import edu.princeton.cs.algs4.LookupIndex;

public class LinkedListDeque<dataType> {
    private Node sentinel;
    private int size;


    public class Node{
        public Node prev;
        public dataType item;
        public Node next;

        public Node(){
            prev = null;
            item = null;
            next = null;
        }

        public Node(Node p, dataType i, Node n){

            prev = p;
            item = i;
            next = n;

        }

    }

    public LinkedListDeque(){
        size = 0;

        sentinel = new Node(null, null ,null);

        sentinel.prev = sentinel;
        sentinel.next = sentinel;

    }

    public LinkedListDeque(LinkedListDeque other){
        sentinel = new Node();
        sentinel.prev = sentinel;
        sentinel.next = sentinel;

        for(int i = 0; i < other.size(); i += 1){
            addLast((dataType) other.get(i));
        }

    }


    /**List machinery
     * The last Node is: sentinel.prev
     * The first Node is: sentinel.next
     * "last".next = sentinel
     * @param q
     */

    public void addFirst(dataType q ){
        Node p = new Node(null,q,null);
        p.next = sentinel.next;
        sentinel.next.prev = p;
        sentinel.next = p;
        p.prev = sentinel;
        size +=1;
    }

    public void addLast(dataType q){
        Node p = new Node(null,q,null);
        //Link last Node with List
        sentinel.prev.next= p;
        p.prev = sentinel.prev;

        //Move sentinel
        p.next = sentinel;
        sentinel.prev = p;


        size +=1;
    }

    public Node removeFirst(){
        Node p = sentinel.next;
        if(p == sentinel){
            return null;
        }

        sentinel.next = sentinel.next.next;
        sentinel.next.prev = sentinel;

        size -=1;
        return p;
    }

    public Node removeLast(){

        Node p = sentinel.prev;
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
        Node p = sentinel.next;
        while(p != sentinel) {
            System.out.print(p.item+" ");
            p = p.next;
        }
        System.out.println();
    }

    public dataType get(int i){
        Node p = sentinel;
        while(p.next !=sentinel){
            if(i == 0){
                return p.item;
            }
            p = p.next;
            i--;
        }

        return null;
    }

    public static void main(String[] args) {

    }














}
