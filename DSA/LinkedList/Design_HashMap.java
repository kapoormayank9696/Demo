// Design HashMap Algorithm Implementation In Java

import java.util.HashMap;

public class Design_HashMap {

    public static class MyHashMap {

        HashMap<Integer, Integer> map;

        public MyHashMap() {
            map = new HashMap<>();
        }

        // Insert Operation
        public void put(int key, int value) {
            map.put(key, value);
        }

        // Get Operation
        public int get(int key) {
            return map.getOrDefault(key, -1);
        }

        // Remove Operation
        public void remove(int key) {
            map.remove(key);
        }

        // Print Operation
        public String display() {
            return map.toString();
        }
    }

    // Main function
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();

        int[] nums = {1, 1, 2, 2, 1, 3, 2, 1, 2, 2, 2};
        for (int num : nums) {
            hashMap.put(num, num);
        }

        System.out.println("\nPrint Hash Map: " + hashMap.display());

        System.out.println("Get The Value From Hash Map: " + hashMap.get(2));
        hashMap.remove(2);
        System.out.println("After Remove the value from Hash Map: " + hashMap.display());
    }
}
