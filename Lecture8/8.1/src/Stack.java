public class Stack<Item> {

    public class node<Item>{
        private Item i;
        private node next;

        public node(){
            i = null;
            next = null;

        }

        public node(Item m){
            i = m;
            next = null;

        }

    }

    private node first = new node();
    private int size;

    public void push(Item x){
        first.next = new node(x);

    }










}
