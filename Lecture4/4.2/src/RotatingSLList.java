public class RotatingSLList<datatype> extends SLList<datatype> {

    public void rotateRight(){
        AddFirst(RemoveLast());


    }




    public static void main(String[] args) {

        RotatingSLList<Integer> m = new RotatingSLList<>();
        m.AddLast(13);
        m.AddLast(12);
        m.AddLast(11);
        m.AddLast(10);
        m.rotateRight();
        m.print();

    }


}
