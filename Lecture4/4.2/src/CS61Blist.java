public interface CS61Blist<datatype> {
    public void AddFirst(datatype m);
    public void AddLast(datatype m);
    public datatype RemoveLast();
    public datatype getFirst();
    public datatype getLast();
    public datatype get(int i);
    public void insert(datatype m, int pos);
    public int size();

    default public void print(){
        int m = size();
        for(int i =0; i < m ; i++){

            System.out.print(get(i)+" ");

        }
        System.out.println();

    }

}
