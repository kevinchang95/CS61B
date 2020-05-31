public interface List61B<item> {

    public void addFirst(item x);
    public void addLast(item x);
    public item getFirst();
    public item getLast();
    public item removeLast();
    public item get(int index);
    public void insert(item x, int position);
    public int size();

    default public void print(){
        for(int i = 0; i < size(); i++){

            System.out.print(get(i) + " ");

        }
        System.out.println();

    }


}
