// Singly Linked List Algorithm Implementation In Java

import java.util.LinkedList;
import java.util.Scanner;
public class SinglyLinkedList{

    // Main function
    public static void main(String[] args) {
        @SuppressWarnings("Convert2Diamond")
        LinkedList<Integer> list = new LinkedList<Integer>();
        @SuppressWarnings("Unused")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            // add function add the value of linked list at the end of position
            list.add(value);
        }
        
        // Display linked list data
        System.out.println("Linked List in form of list('[]'): "+list);
        // Insert at beginning position
        list.addFirst(34);
        // Insert at specific position
        list.add(n-1, 23);
        // Insert at last position
        list.addLast(79);
        
        // Display function
        System.out.print("After Insertion Positions Into Linked List: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("null");

        // Delete at beginning position
        list.removeFirst();
        // Delete at specific position
        list.remove(2);
        // Delete at last position
        list.removeLast();
        // Display linked list data
        System.out.println("Linked List in form of list('[]'): "+list);

        // Searching Operation
        System.out.print("Enter target value from linked list: ");
        int value=sc.nextInt();
        for(int i=0;i<list.size();i++){
            if(list.get(i) == value){
                System.out.println("Index of target linked list value: "+i);
            }
        }

        // Updation Operation
        list.set(4,82);
        // Display Operation
        System.out.print("Linked List data: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("null");

        // Size Operation
        System.out.println("Size of linked list: "+list.size());
        sc.close();
    }
}

