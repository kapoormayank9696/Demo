// Merge In Between Linked Lists Algorithm Implementation In Java

public class MergeIn_BetweenLL {

    // Node class of Singly Linked List
    public static class ListNode {

        // Data Members with Public Access Modifier
        public int val;
        public ListNode next;

        // Parameterized Constructor
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Class Of Solution
    public static class Solution {

        public ListNode head = null;

        // Insert Operation
        public void insert(int val) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
                return;
            }
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Merge In Between Operation
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode current = list1;
            // Finding the node at position a-1
            for (int i = 0; i < a - 1; i++) {
                current = current.next;
            }

            ListNode prevA = current;
            // Finding the node at position b
            ListNode temp = prevA.next;
            for (int i = a; i < b; i++) {
                temp = temp.next;
            }

            ListNode afterB = temp.next;

            // Finding the last node of list2
            ListNode l2 = list2;
            while (l2.next != null) {
                l2 = l2.next;
            }

            // Linking the nodes
            prevA.next = list2;
            l2.next = afterB;
            return list1;
        }

        // Display Operation
        public void display(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Creating first linked list: 10 -> 1 -> 13 -> 6 -> 9 -> 5
        solution.insert(10);
        solution.insert(1);
        solution.insert(13);
        solution.insert(6);
        solution.insert(9);
        solution.insert(5);
        System.out.print("Original Linked List:");
        solution.display(solution.head);

        // Creating second linked list: 1000000 -> 1000001 -> 1000002
        ListNode list2 = new ListNode(1000000);
        list2.next = new ListNode(1000001);
        list2.next.next = new ListNode(1000002);
        ListNode current = list2;
        System.out.print("Second Linked List:");
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");

        // Merging list2 into list1 between positions a=3 and b=4
        ListNode mergedList = solution.mergeInBetween(solution.head, 3, 4, list2);

        // Displaying the merged linked list
        System.out.print("Merged Linked List:");
        solution.display(mergedList);
    }
}
