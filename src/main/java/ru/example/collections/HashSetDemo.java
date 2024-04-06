package ru.example.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public HashSetDemo() {
    }

    private final HashSet<String> H1 = new HashSet<String>();

    public void addItemToHashSet(String itemToAdd) {
        H1.add(itemToAdd);
        System.out.println("Added item: " + itemToAdd);
    }

    public void removeItemToHashSet(String itemToRemove) {
        H1.remove(itemToRemove);
        System.out.println("Removed item: " + itemToRemove);
    }

    public void removeAllItemsFromHashSet() {
        H1.clear();
        System.out.println("Removed all items");
    }

    public void checkItemInHashSet(String value) {
        if(!H1.contains(value)) {
            System.out.println("Item " + value + " is missing");
        }
            else {
            System.out.println("Item " + value + " found");
        }
    }

    public void getAllItemsFromHashSet() {
        System.out.println("HashSet size = " + H1.size());
        System.out.println("HashSet contains:");
        Iterator<String> iterator = H1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
