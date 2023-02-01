package unit11.collections.day42.queueinterface;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LIFOExample {
    public static void main(String[] args) {
        Deque<Integer> integerDeque = new LinkedList<>();
        integerDeque.push(99);
        System.out.println(integerDeque);
        integerDeque.push(11);
        System.out.println(integerDeque);
        integerDeque.push(55);
        System.out.println(integerDeque);
        System.out.println(integerDeque.pop());
        System.out.println(integerDeque);
        System.out.println(integerDeque.peek());
        System.out.println(integerDeque);
        System.out.println(integerDeque.pop());
        System.out.println(integerDeque.pop());
        System.out.println(integerDeque);
//        System.out.println(integerDeque.pop());
        System.out.println(integerDeque);

    }
}
