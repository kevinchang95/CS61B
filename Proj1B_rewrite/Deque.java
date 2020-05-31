public interface Deque<item> {

    public void addFirst(item x);
    public void addLast(item x);
//    public boolean isEmpty();
    public int size();
    public void printDeque();
    public item removeFirst();
    public item removeLast();
    public item get(int index);


    default public boolean isEmpty(){

        return(size() == 0);

    }




}
