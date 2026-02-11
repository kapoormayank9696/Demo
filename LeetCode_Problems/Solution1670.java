// LeetCode Problem 1670: Design Front Middle Back Queue

import java.util.ArrayList;
import java.util.Scanner;
public class Solution1670{

    // class of Queue in which various operation are perform of queue
    static class FrontMiddleBackQueue {
        // Define ArrayList
        ArrayList<Integer> list;
        // FrontMiddleBackQueue Operation
        public FrontMiddleBackQueue() {
            list=new ArrayList<>();
        }

        // Push Operation In Front Of Queue
        public void pushFront(int val) {
            list.add(0,val);
        }

        // Push Operation In Middle Of Queue
        public void pushMiddle(int val) {
            int k=list.size()/2;
            list.add(k,val);
        }

        // Push Operation In Back Of Queue
        public void pushBack(int val) {
            list.add(val);
        }

        // Pop Operation In Front Of Queue
        public int popFront() {
            if(list.isEmpty()){
                return -1;
            }
            int k=list.get(0);
            list.remove(0);
            return k;
        }

        // Pop Operation In Middle Of Queue
        public int popMiddle() {
            if(list.isEmpty()) return -1;
            int k=(list.size()-1)/2;
            int value= list.remove(k);
            return value;
        }

        // Pop Operation In Back Of Queue
        public int popBack() {
            if(list.isEmpty()){
                return -1;
            }
            return list.remove(list.size()-1);
        }

        // Display Function
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
        System.out.print("Enter elements: ");
        FrontMiddleBackQueue queue=new FrontMiddleBackQueue();
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            queue.pushBack(value);
        }
        System.out.println("Original queue elements of data: "+queue.toString());

        System.out.print("Enter first queue element: ");
        int frontValue=sc.nextInt();
        queue.pushFront(frontValue);
        System.out.print("Enter last queue element: ");
        int backValue=sc.nextInt();
        queue.pushBack(backValue);
        System.out.print("Enter middle of queue element: ");
        int middleValue=sc.nextInt();
        queue.pushMiddle(middleValue);

        System.out.println("After pushing the value of queue data: "+queue.toString());

        System.out.println("Poped first queue element: "+queue.popFront());
        System.out.println("Popped middle queue element: "+queue.popMiddle());
        System.out.println("Popped last queue element: "+queue.popBack());

        System.out.println("After popped the values from queue: "+queue.toString());
        sc.close();
    }
}
