package unit11.collections.day43.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityString {
    public static void main(String[] args) {
        Queue<String> priorityString = new PriorityQueue<>(Comparator.reverseOrder());
        priorityString.offer("Tokyo");
        priorityString.offer("Trabzon");

        priorityString.offer("New York");
        priorityString.offer("New Orlean");
        priorityString.offer("Orlando");
        priorityString.offer("Virginia");
        priorityString.offer("Alabama");

        System.out.println(priorityString);
        priorityString.poll();
        priorityString.poll();
        priorityString.poll();
        priorityString.poll();
        priorityString.poll();
        priorityString.poll();
        priorityString.poll();
        priorityString.poll();
        System.out.println(priorityString);

    }
}
