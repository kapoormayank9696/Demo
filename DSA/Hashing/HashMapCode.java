// Hash Map Code Algorithm Implementation In Java

import java.util.LinkedList;
public class HashMapCode {
    static class HashMap<K,V> { // generics
        private class Node {
            K key;
            V value;
            // Parameterized Constructor
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        // Data Members
        private int n; // number of nodes
        private int N; // size of bucket array
        private LinkedList<Node>[] buckets; // bucket array
        
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4; // initial size of bucket array
            
            // Initialize bucket array with linked lists
            this.buckets = new LinkedList[N];
            // Initialize each bucket with a new linked list
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // Hash Function
        private int hashFunction(K key) { // 0 to N-1
            // hashCode() :- inbuilt function which gives hash code of key
            int hc = key.hashCode();
            // abs :- absolute value, % :- modulus operator
            return Math.abs(hc) % N;
        }

        // Search In Linked List
        private int searchInLL(K key, int bi) { // bucket index
            LinkedList<Node> ll = buckets[bi];
            int di = 0; // data index
            for (Node node : ll) {
                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1; // key not found
        }
        
        // Put Opearation
        public void put(K key, V value) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index in bucket
            if( di == -1) { // Key does not exist
                buckets[bi].add(new Node(key,value));
                n++;
            }else { // key exists
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double)n/N; // load factor
            if(lambda > 2.0) {
                rehash();
            }
        }

        // Get Opearation
        public V get(K key) {
            return null;
        }

        // Contains Key Opearation
        public boolean containsKey(K key) {
            return false;
        }

        // Remove Opearation
        public void remove(K key) {
        }

        // Size Opearation
        public int size() {
            return n;
        }

        // Key Set Opearation
        public ArrayList<K> keySet() {

        }
        // Is Empty Opearation
        public boolean isEmpty() {
            return n == 0;
        }
    }

    // Main function
    public static void main(String[] args) {

    }
}

