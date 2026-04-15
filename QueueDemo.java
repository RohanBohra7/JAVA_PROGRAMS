import java.util.*;

public class QueueDemo {
    public static void main(String[] args)
    {
        Queue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        Deque<Integer>dq=new ArrayDeque<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        dq.addAll(pq);

        System.out.println(pq);

        System.out.println("Peek: "+pq.peek());

        System.out.println("Poll: "+pq.poll());

        System.out.println("After Poll: "+pq);

        pq.remove(20);

        System.out.println("Final Queue: "+pq);
    }
}
