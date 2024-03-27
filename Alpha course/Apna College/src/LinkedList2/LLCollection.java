package LinkedList2;
import java.util.LinkedList; //JCF : Java collection framework

public class LLCollection {
    public static void main(String[] args) {
//        object : int - > Integer , char ->Character boolean ->Boolean
//        create
        LinkedList<Integer> ll = new LinkedList<>();

//        add elements to it
        ll.addLast(1);;
        ll.addLast(2);;
        ll.addFirst(0);
//         0->1->2
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
}
