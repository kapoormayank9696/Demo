// LeetCode Problem 146: LRU (Least Recently Used) Cache

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution146 {

    // LRUCache class
    public static class LRUCache {
        public int capacity;
        public HashMap<Integer,Integer> map;

        // Parameterized Constructor
        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new LinkedHashMap<>(capacity,0.75f,true);
        }
    
        // Get Method
        public int get(int key) {
            if(!map.containsKey(key)) {
                return -1;
            }
            return map.get(key);
        }
    
        // Put Method
        public void put(int key, int value) {
            if(map.containsKey(key)) {
                map.put(key,value);
                return;
            }

            if(map.size() == capacity) {
                int firstKey = map.keySet().iterator().next();
                map.remove(firstKey);
            }
            map.put(key,value);
        }

        // Display Method
        public void display() {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.print("[" + entry.getKey() + ":" + entry.getValue() + "] ");
            }
            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1, 10);
        lruCache.put(2, 20);
        lruCache.put(3, 30);
        lruCache.display(); // Output: [1:10] [2:20] [3:30] 

        lruCache.get(1); // Access key 1
        lruCache.put(4, 40); // This will evict key 2
        lruCache.display(); // Output: [3:30] [1:10] [4:40] 

        System.out.println("Get key 2: " + lruCache.get(2)); // Output: -1 (not found)
    }
}
