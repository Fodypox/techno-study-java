package unit11.collections.day43.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityOrder {
    public static void main(String[] args) {
        Queue<Integer> priorityInegers = new PriorityQueue<>();
    priorityInegers.offer(45);
    priorityInegers.offer(13);
    priorityInegers.offer(23);
    priorityInegers.offer(13);
//        System.out.println(priorityInegers.poll());
//        System.out.println(priorityInegers);
    priorityInegers.offer(13);
        System.out.println(priorityInegers);
    }
}
