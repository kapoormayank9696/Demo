// LeetCode Problem 707: Design Linked List

import java.util.LinkedList;

public class Solution707 {

    // Class to Design The Linked List
    public static class MyLinkedList {

        // Create Linked List
        LinkedList<Integer> list;

        // Linked List Type
        public MyLinkedList() {
            list = new LinkedList<>();
        }

        // Get Node Value
        public int get(int index) {
            if (index < 0 || index >= list.size()) {
                return -1;
            }
            return list.get(index);
        }

        // Add At Head Position
        public void addAtHead(int val) {
            list.addFirst(val);
        }

        // Add At Tail Position
        public void addAtTail(int val) {
            list.addLast(val);
        }

        // Add At Specific Position
        public void addAtIndex(int index, int val) {
            if (index < 0 || list.size() < index) {
                return;
            }
            list.add(index, val);
        }

        // Delete At Specific Position
        public void deleteAtIndex(int index) {
            if (index < 0 || list.size() < index) {
                return;
            }
            list.remove(index);
        }
    }

    // Main function
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();

        obj.addAtHead(10);
        obj.addAtTail(20);
        obj.addAtHead(5);

        System.out.print("Print Linked List : ");
        System.out.print(obj.get(0) + " ");
        System.out.print(obj.get(1) + " ");
        System.out.println(obj.get(2) + " ");

        obj.addAtIndex(1, 99);

        System.out.print("After Update Linked List : ");
        System.out.println(obj.get(1));

        obj.deleteAtIndex(2);

        System.out.print("Delete value from Linked List : ");
        System.out.println(obj.get(2));
    }
}
