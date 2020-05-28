public class VengefulSLList<datatype> extends SLList<datatype> {
    SLList<datatype> deletedItems;


    public VengefulSLList(){

        deletedItems = new SLList<datatype>();

    }
    public VengefulSLList(datatype x){
        super(x);
        deletedItems = new SLList<datatype>();
    }

    @Override
    public datatype RemoveLast(){

        datatype oldBack = super.RemoveLast();
        deletedItems.AddLast(oldBack);

        return oldBack;

    }


    public void printLostItems(){

        deletedItems.print();

    }

    public static void main(String[] args) {
        VengefulSLList<Integer> m = new VengefulSLList<>(1);

        m.AddLast(5);
        m.AddLast(10);
        m.AddLast(15);
        m.AddLast(20);
        m.RemoveLast();
        m.RemoveLast();
        m.printLostItems();
        m.print();
    }


}
