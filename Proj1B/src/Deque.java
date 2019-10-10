public interface Deque<datatype> {

    void addFirst(datatype item);
    void addLast(datatype item);
    int size();
    void printDeque();
    datatype removeFirst();
    datatype removeLast();
    datatype get(int index);
    default boolean isEmpty(){

            return size() == 0;
    }



}
