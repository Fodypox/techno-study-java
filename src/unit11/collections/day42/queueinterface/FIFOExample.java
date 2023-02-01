package unit11.collections.day42.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOExample {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();
        System.out.println(integerQueue);
        integerQueue.offer(34);
        integerQueue.offer(35);
        integerQueue.offer(111);
        System.out.println(integerQueue);
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue);
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue);
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue);

    }
}
