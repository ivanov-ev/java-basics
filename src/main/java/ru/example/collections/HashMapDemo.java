package ru.example.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public HashMapDemo() {
    }

    private final HashMap<Integer, String> HM1 = new HashMap<Integer, String>();

    public void addItemToHashMap(Integer key, String itemToAdd) {
        HM1.put(key, itemToAdd);
        System.out.println("Added item: " + itemToAdd + " for key " + key);
    }

    public void removeItemFromHashMap(int key) {
        String removedItem = HM1.remove(key);
        System.out.println("Removed item: " + removedItem + ", with key: " + key);
    }

    public void removeItemFromHashMap(int key, String itemToRemove) {
        HM1.remove(key, itemToRemove);
        System.out.println("Removed item: " + itemToRemove + ", with key: " + key);
    }

    public void removeAllItemsFromHashMap() {
        HM1.clear();
        System.out.println("Removed all items");
    }

    public void checkItemByKeyInHashMap(Integer key) {
        if(HM1.get(key) != null) {
            System.out.println("Item \"" + HM1.get(key) + "\" found");
        }
        else {
            System.out.println("Item with key \"" + key + "\" not found");
        }
    }

    public void checkItemByValueInHashMap(String value) {
        if(HM1.containsValue(value)) {
            System.out.println("Item \"" + value + "\" found");
        }
        else {
            System.out.println("Item with value \"" + value + "\" not found");
        }
    }

    public void getAllItemsFromHashMap() {
        System.out.println("HashMap size = " + HM1.size());
        System.out.println("HashMap contains:");
        for (Map.Entry<Integer, String> hashMapEntry : HM1.entrySet()) {
            System.out.println("Key: " + hashMapEntry.getKey() + ", item: " + hashMapEntry.getValue());
        }
    }
}
