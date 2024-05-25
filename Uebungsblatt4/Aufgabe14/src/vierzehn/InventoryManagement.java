package vierzehn;

import java.util.HashMap;

public class InventoryManagement {

    HashMap<String, Integer> map = new HashMap<>();

    boolean containsItem(String item) {
        return map.containsKey(item);
    }

    void addItem(String item, int amount) {
        map.put(item, map.getOrDefault(item, 0) + amount);
    }

    int getItemCount(String item) {
        return map.getOrDefault(item, 0);
    }
}
