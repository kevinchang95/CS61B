public class VengefulSLList<Item> extends SLList<Item>{

    private SLList<Item> deletedList;

    public VengefulSLList(){
        deletedList = new SLList<>();
    }


    @Override
    public Item removeLast(){

        Item deletedItem = super.removeLast();
        deletedList.addLast(deletedItem);

        return deletedItem;

    }

    public void printLostItems(){

        deletedList.print();


    }

    public static void main(String[] args) {
        VengefulSLList<Integer> vs1 = new VengefulSLList<Integer>();
        vs1.addLast(1);
        vs1.addLast(5);
        vs1.addLast(10);
        vs1.addLast(13);      /* [1, 5, 10, 13] */
        vs1.removeLast();     /* 13 gets deleted. */
        vs1.removeLast();     /* 10 gets deleted. */
        System.out.print("The fallen are: ");
        vs1.printLostItems(); /* Should print 10 and 13. */
    }





}
