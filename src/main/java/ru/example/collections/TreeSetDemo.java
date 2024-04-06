package ru.example.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public TreeSetDemo() {
    }

    private final TreeSet<String> T1 = new TreeSet<String>();

    public void addItemToTreeSet(String itemToAdd) {
        T1.add(itemToAdd);
        System.out.println("Added item: " + itemToAdd);
    }

    public void removeItemToTreeSet(String itemToRemove) {
        T1.remove(itemToRemove);
        System.out.println("Removed item: " + itemToRemove);
    }

    public void removeAllItemsFromTreeSet() {
        T1.clear();
        System.out.println("Removed all items");
    }

    public void checkItemInTreeSet(String value) {
        if (!T1.contains(value)) {
            System.out.println("Item " + value + " is missing");
        } else {
            System.out.println("Item " + value + " found");
        }
    }

    public void getAllItemsFromTreeSet() {
        System.out.println("TreeSet size = " + T1.size());
        if (!T1.isEmpty()) {
            System.out.println("TreeSet contains:");
            Iterator<String> iterator = T1.iterator();
            do {
                System.out.println(iterator.next());
            }
            while (iterator.hasNext());
        }
    }

    public void viewArrangedTreeSet() {
        System.out.println("TreeSet is:" + T1);
    }
}
