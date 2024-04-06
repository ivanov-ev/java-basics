package ru.example.collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public ArrayListDemo() {
    }

    private final ArrayList<String> A1 = new ArrayList<>();

    public void addItemToArrayList(String itemToAdd) {
            A1.add(itemToAdd);
            System.out.println("Added item: " + itemToAdd);
    }

    public void addItemToArrayList(int index, String itemToAdd) {
        A1.add(index, itemToAdd);
        System.out.println("Added item to position " + index + ": " + itemToAdd);
    }

    public void removeItemByValueFromArrayList(String itemToRemove) {
            A1.remove(itemToRemove);
            System.out.println("Removed item: " + itemToRemove);
    }

    public void removeItemByIndexFromArrayList(int itemIndex) {
        A1.remove(itemIndex);
        System.out.println("Removed item by index: " + itemIndex);
    }

    public void removeAllItemsFromArrayList() {
        A1.clear();
        System.out.println("Removed all items");
    }

    private String getItemFromArrayList(int index) {
        System.out.println(A1.get(index));
        return A1.get(index);
    }

    public void getAllItemsFromArrayList() {
        System.out.println("ArrayList size = " + A1.size());
        System.out.println("ArrayList contains:");
        for(int i = 0; i < A1.size(); i++) {
            getItemFromArrayList(i);
        }
    }
}
