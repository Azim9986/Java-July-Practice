package aug22;

import java.util.LinkedList;
import java.util.Queue;

public class Queuedemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(23);
        queue.offer(22);
        queue.offer(21);
        queue.offer(25);



        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
