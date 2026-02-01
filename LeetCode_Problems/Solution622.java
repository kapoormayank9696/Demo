// LeetCode Problem 622: Design Circular Queue

import java.util.ArrayList;
import java.util.Scanner;
public class Solution622{
    static class MyCircularQueue {
        ArrayList<Integer> list;
        int capacity;
        public MyCircularQueue(int k) {
            list = new ArrayList<>();
            capacity=k;
        }

        // Enqueue Operation
        public boolean enQueue(int value) {
            if(isFull()){
                return false;
            }
            list.add(value);
            return true;
        }

        // Dequeue Operation
        public boolean deQueue() {
            if(isEmpty()){
                return false;
            }
            list.remove(0);
            return true;
        }

        // Front value carry operation
        public int Front() {
            if(list.isEmpty()) return -1;
            Integer value = list.get(0);
            return value != null ? value : -1;
        }

        // Rear Operation
        public int Rear() {
            if(list.isEmpty()) return -1;
            Integer value = list.get(list.size()-1);
            return value != null ? value : -1;
        }
        
        // Check queue is empty or not
        public boolean isEmpty() {
            return list.isEmpty();
        }
    
        // Check queue is full or not
        public boolean isFull() {
            return list.size() == capacity;
        }

        // Display method of queue data
        @Override
        public String toString(){
            return list.toString();
        }
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        MyCircularQueue queue=new MyCircularQueue(n);
        System.out.print("Enter element: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            queue.enQueue(value);
        }
        System.out.println("Display queue data: "+queue.toString());
        System.out.println("Rear element: "+queue.Rear());
        System.out.println("Queue is full or not: "+queue.isFull());
        System.out.println("Dequeue element from queue: "+queue.deQueue());
        System.out.println("Enqueue element into queue: "+queue.enQueue(4));
        System.out.println("Display queue data: "+queue.toString());
        System.out.println("Rear element: "+queue.Rear());
        sc.close();
    }
}