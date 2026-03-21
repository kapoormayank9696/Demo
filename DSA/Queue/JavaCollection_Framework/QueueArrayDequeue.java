// Queue Implemenatation In Java By Using Java Collection Framework

import java.util.*;
public class QueueArrayDequeue{

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        // Queue Interface left side and ArrayDeque Class Use
        Queue<Integer> queue=new ArrayDeque<>();
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
        System.out.print("Enter value for searching: ");
        int value=sc.nextInt();
        if(queue.contains(value)) {
            System.out.println("Yes, the value exist into queue..");
        }else {
            System.out.println("No, the value is not exist into queue..");
        }
        sc.close();
    }
}
