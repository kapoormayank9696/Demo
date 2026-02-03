// Hash Table Algorithm Perform In Java By Using Linked List

import java.util.LinkedList;
import java.util.Scanner;

// Hash Table using Linked List
public class HashTableUsinglinkedList {

    // Node of linked list
    static class HashNode {
        // Default Access Modifier And Data Memebers
        int key;
        String value;
        // Parameterized Constructor
        public HashNode(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // HashMap Custom Implementation
    static class HashMapCustom {
        private final int size;
        private final LinkedList<HashNode>[] table;

        @SuppressWarnings("unchecked")
        public HashMapCustom(int size) {
            this.size = size;
            table = new LinkedList[size];
            for (int i = 0; i < size; i++) {
                table[i] = new LinkedList<>();
            }
        }

        // Hash function
        private int hash(int key) {
            return key % size;
        }

        // Insert key-value
        public void put(int key, String value) {
            int index = hash(key);
            LinkedList<HashNode> list = table[index];

            // Check if key already exists, update value
            for (HashNode node : list) {
                if (node.key == key) {
                    node.value = value;
                    return;
                }
            }

            // If key not found, add new node
            list.add(new HashNode(key, value));
        }

        // Get value by key
        public String get(int key) {
            int index = hash(key);
            LinkedList<HashNode> list = table[index];

            for (HashNode node : list) {
                if (node.key == key) {
                    return node.value;
                }
            }
            return null; // not found
        }

        // Display Hash Table
        public void display() {
            for (int i = 0; i < size; i++) {
                System.out.print("Bucket " + i + ": ");
                for (HashNode node : table[i]) {
                    System.out.print("[" + node.key + "=>" + node.value + "] ");
                }
                System.out.println();
            }
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of hash table: ");
        int size = sc.nextInt();
        HashMapCustom hashMap = new HashMapCustom(size);
        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter key (int) and value (String): ");
            int key = sc.nextInt();
            String value = sc.next();
            hashMap.put(key, value);
        }
        System.out.println("\nHash Table:");
        hashMap.display();
        System.out.print("\nEnter key to search: ");
        int searchKey = sc.nextInt();
        String result = hashMap.get(searchKey);
        if (result != null) {
            System.out.println("Key " + searchKey + " has value: " + result);
        } else {
            System.out.println("Key not found.");
        }
        sc.close();
    }
}
