package PriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Operation {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(2);
        pq.add(1);
        pq.add(4);
        while(pq!= null)
        {
            System.out.println(pq.peek());
            pq.remove();
        }


    }
}
