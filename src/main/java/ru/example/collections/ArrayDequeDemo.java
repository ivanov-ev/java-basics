package ru.example.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {

    public ArrayDequeDemo() {
    }

    private final Deque<String> AD1 = new ArrayDeque<String>();

    public void addFirstItemToArrayDeque(String itemToAdd) {
        AD1.addFirst(itemToAdd);
        System.out.println("Added the first item: " + itemToAdd);
    }

    public void addLastItemToArrayDeque(String itemToAdd) {
        AD1.addLast(itemToAdd);
        System.out.println("Added the last item: " + itemToAdd);
    }

    public void pollFirstItemFromArrayDeque() {
        System.out.println("\nPolled the first item: " + AD1.pollFirst());
    }

    public void pollLastItemFromArrayDeque() {
        System.out.println("\nPolled the last item: " + AD1.pollLast());
    }

    public void getAllItemsFromArrayDequeLifo() {
        Iterator value = AD1.descendingIterator();
        System.out.println("ArrayDeque size = " + AD1.size());
        System.out.println("ArrayDeque contains (LIFO): ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }

    public void getAllItemsFromArrayDequeFifo() {
        System.out.println("ArrayDeque size = " + AD1.size());
        System.out.println("ArrayDeque contains (FIFO):");
        AD1.forEach(System.out::println);
    }
}
