public class RotatingSLList<item> extends SLList<item>{

    public void rotateRight(){

        item last = removeLast();
        addFirst(last);


    }




}
