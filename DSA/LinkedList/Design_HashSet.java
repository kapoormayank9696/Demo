// Design HashSet Algorithm Implementation In Java

import java.util.HashSet;
import java.util.Set;

public class Design_HashSet {

    // HashSet Class
    public static class MyHashSet {

        // Set Class
        Set<Integer> set;

        public MyHashSet() {
            set = new HashSet<>();
        }

        // Add
        public void add(int key) {
            set.add(key);
        }

        // Remove
        public void remove(int key) {
            set.remove(key);
        }

        // Check it contains or not
        public boolean contains(int key) {
            return set.contains(key);
        }

        // Display
        public String display() {
            return set.toString();
        }
    }

    // Main function
    public static void main(String[] args) {

        // Object Of MyHashSet Class
        MyHashSet hashSet = new MyHashSet();
        int[] arr = {1, 2, 1, 3, 2, 2, 2, 2};
        for (int num : arr) {
            hashSet.add(num);
        }

        System.out.println("\nDisplay HashSet : " + hashSet.display());

        hashSet.remove(2);
        System.out.println("HashSet Conatins 2: " + hashSet.contains(2));
        System.out.println("After remove the HashSet: " + hashSet.display());

        System.out.println("HashSet Conatins 1: " + hashSet.contains(1));
        System.out.println("HashSet Conatins 3: " + hashSet.contains(3));
    }
}
