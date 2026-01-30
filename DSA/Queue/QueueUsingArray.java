// Queue Implementation In Java By Using An Array

import java.util.Scanner;
public class QueueUsingArray {
    // Default Access Modifier and Data Members
    int[] arr;
    int front,rear,capacity;

    // Dynamic Constructor
    public QueueUsingArray(int size){
        this.capacity=size;
        this.arr=new int[capacity];
        front = 0;
        rear = -1;
    }

    // Check queue is full or not
    public boolean isFull(){
        return rear == capacity-1;
    }

    // Check queue is an empty or not
    public boolean isEmpty(){
        return front > rear;
    }
    
    // Enqueue Operation
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full!!!");
            return;
        }
        arr[++rear]=data;
    }

    // Dequeue Operation
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is an empty!!!");
            return -1;
        }
        return arr[front++];
    }

    // Peek Operation
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is an empty!!!");
            return -1;
        }
        return arr[front];
    }

    // Display method of queue
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is an empty!!!");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        QueueUsingArray queue=new QueueUsingArray(n);
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            queue.enqueue(value);
        }
        System.out.print("Display queue data: ");
        // Call the display function
        queue.display();
        System.out.println("Top queue element: "+queue.peek());
        System.out.println("Popped queue element: "+queue.dequeue());
        System.out.print("After popped queue data: ");
        // Call the display function
        queue.display();
        System.out.println("Popped queue element: "+queue.dequeue());
        System.out.println("New top queue element: "+queue.peek());
        sc.close();
    }
}
