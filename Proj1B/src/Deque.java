public interface Deque {

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

/**Below are the common methods in LinkedListDeque*/


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


}
