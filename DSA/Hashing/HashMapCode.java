// Hash Map Code Algorithm Implementation In Java

import java.util.LinkedList;
public class HashMapCode {
    @SuppressWarnings("unused")
    static class HashMap<K,V> { // generics
        private class Node {
            K key;
            V value;
            // Parameterized Constructor/ Dynamic Constructor
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        // Data Members
        private int n; // number of nodes
        private final int N; // size of bucket array
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
        
        // Rehashing
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            // Double the size of bucket array
            buckets = new LinkedList[N*2];
            for (int i = 0; i < N*2; i++) {
                LinkedList<Node> ll = new LinkedList<>();
                buckets[i] = ll;
            }
            n = 0; // reset number of nodes
            // Rehash all the nodes from old bucket array to new bucket array
            for (LinkedList<Node> ll : oldBuckets) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
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

        // Get Operation
        public V get(K key) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index in bucket
            if( di != -1) { // Key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
            return null;
        }

        // Contains Key Operation
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        // Remove Operation
        public void remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di != -1) {
                buckets[bi].remove(di);
                n--;
            }
        }

        // Size Operation
        public int size() {
            return n;
        }

        // Key Set Operation
        public ArrayList<K> keySet() {

        }

        // Is Empty Operation
        public boolean isEmpty() {
            return n == 0;
        }
    }

    // Main function
    public static void main(String[] args) {

    }
}

