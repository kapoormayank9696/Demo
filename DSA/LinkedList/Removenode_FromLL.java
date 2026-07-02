// Remove Nodes From Linked List Algorithm Implementation In Java

public class Removenode_FromLL {

    // Node class of Singly Linked List
    public static class ListNode {

        // Data Members with Public Access Modifier
        public int val;
        public ListNode next;

        // Parameterized Constructor
        public ListNode(int val) {
            this.val = val;
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

        // Reverse Operation
        public ListNode reverse(ListNode head) {
            ListNode current = head;
            ListNode next;
            ListNode prev = null;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }

        // Remove Node Operation
        public ListNode removeNode(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            head = reverse(head);
            int max = head.val;
            ListNode temp = head;

            while (temp.next != null) {
                if (temp.next.val < max) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                    max = temp.val;
                }
            }

            return reverse(head);
        }

        // Display Operation
        public void display() {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + "-->");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Main Function
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.insert(5);
        solution.insert(2);
        solution.insert(13);
        solution.insert(3);
        solution.insert(8);

        System.out.print("Original Linked List:");
        solution.display();

        solution.head = solution.removeNode(solution.head);
        System.out.print("Linked List After Removing Nodes:");
        solution.display();
    }
}
