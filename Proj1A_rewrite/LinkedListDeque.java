public class LinkedListDeque<T> {

    public class Node{

        private Node prev;
        private T item;
        private Node next;

        public Node(Node p, T i, Node n){

            prev = p;
            item = i;
            next = n;

        }

    }

    private Node sentinel;
    private int size;

    public LinkedListDeque(){

        sentinel = new Node(null,null,null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;

        size = 0;

    }

    public LinkedListDeque(LinkedListDeque other){

        LinkedListDeque l = new LinkedListDeque();

        for(int i = 0; i < other.size; i++){

            l.addLast(other.get(i));

        }



        sentinel = l.sentinel;
        size = l.size;

    }

    public void addFirst(T item){

        Node newNode = new Node (null,item,null);
        sentinel.next.prev = newNode;
        newNode.next = sentinel.next;
        newNode.prev = sentinel;
        sentinel.next = newNode;

        size = size + 1;

    }

    public void addLast(T item){

        Node newNode =  new Node(null,item,null);
        sentinel.prev.next = newNode;
        newNode.prev = sentinel.prev;
        sentinel.prev = newNode;
        newNode.next = sentinel;

        size = size + 1;

    }

    public boolean isEmpty(){

        return(size==0);

    }

    public int size(){
        return size;
    }

    public void printDeque(){
        Node p = sentinel.next;
        for(int i = 0;i < size; i++){

            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.println();

    }

    public T removeFirst(){

        if(size == 0) return null;
        Node n = sentinel.next;
        n.next.prev = sentinel;
        sentinel.next = n.next;

        size = size - 1;

        return n.item;
    }

    public T removeLast(){

        if(size == 0)return null;
        Node l = sentinel.prev;
        l.prev.next = sentinel;
        sentinel.prev = l.prev;

        size = size - 1;

        return l.item;
    }


    public T get(int index){
        if(index > size - 1){
            return null;
        }

        Node p = sentinel.next;
        for (int i = 0; i < index; i++){
            p = p.next;
        }

        return p.item;
    }





    public static void main(String[] args){

        LinkedListDeque<Integer> l1 = new LinkedListDeque<>();
        System.out.println(l1.isEmpty());
        l1.addFirst(15);
        l1.addFirst(10);
        l1.addFirst(5);
        l1.addLast(20);
        l1.addLast(25);
        l1.addLast(30);
        System.out.println(l1.get(3));
        System.out.println(l1.get(4));
        System.out.println(l1.get(5));
        System.out.println(l1.isEmpty());
        l1.printDeque();
        System.out.println(l1.removeFirst());
        l1.printDeque();
        System.out.println(l1.removeLast());
        l1.printDeque();
        LinkedListDeque<Integer> l2 = new LinkedListDeque<>(l1);
        l2.printDeque();

    }


}


