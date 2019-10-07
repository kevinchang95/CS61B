import javax.lang.model.type.ArrayType;
import java.net.SocketOption;

public class ArrayDequeTest {


    public static void main(String[] args) {
        System.out.println("Create an empty list a");
        ArrayDeque<String> a = new ArrayDeque<>() ;
        System.out.println("Checking whether the list is empty");
        System.out.println(a.isEmpty());
        System.out.println("add 4 first element and 3 last element");
        a.addFirst("Zero");
        a.addFirst("One");
        a.addFirst("Two");
        a.addFirst("Three");
        a.addLast("Four");
        a.addLast("Five");
        a.addLast("Six");

        System.out.println("print the list out");
        a.printDeque();
       /* System.out.println("print the physical location of the list");
        for (int i = 0 ; i < a.size; i++){
            System.out.print((String)a.items[i] + " ");

        }*/

        a.addLast("Seven");
        a.addFirst("Eight");
        System.out.println("testing the upsize of the list");
        a.printDeque();
        System.out.println("Print the 6th element:");
        System.out.println(a.get(6));



    }

}
