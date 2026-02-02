// Queue Implemenatation In Java By Using Java Collection Framework

import java.util.*;
public class QueueLinkedList{

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Queue<Integer> queue=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter element: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            queue.add(value);
        }
        System.out.println("Display queue data: "+queue.toString());
        System.out.println("Top queue element: "+queue.peek());
        System.out.println("Popped queue element: "+queue.remove());
        System.out.println("New top queue element: "+queue.peek());
        sc.close();
    }
}
