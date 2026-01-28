// Queue Implementation In Java By Using An ArrayList

import java.util.ArrayList;
import java.util.Scanner;
public class QueueUsingArrayList {
    // Method to perform the ArrayList
    public static class Queue{
        ArrayList<Integer> list=new ArrayList<>();
        // Empty function which check queue is an empty or not
        public boolean isEmpty(){
            return list.isEmpty();
        }

        // Enqueue operation
        public void enqueue(int data){
            list.add(data);
        }

        // Dequeue operation
        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is an empty!!!");
                return -1;
            }
            int k=list.get(0);
            list.remove(0);
            return k;
        }

        // Peek operation
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(0);
        }

        @Override
        public String toString(){
            return list.toString();
        }
    } 

    // Main function
    public static void main(String[] args) {
        Queue queue=new Queue();
        @SuppressWarnings("unused")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            queue.enqueue(value);
        }
        System.out.println("Display the queue data: "+queue.toString());
        System.out.println("Top queue element: "+queue.peek());
        System.out.println("Popped element: "+queue.dequeue());
        sc.close();
    }
}
