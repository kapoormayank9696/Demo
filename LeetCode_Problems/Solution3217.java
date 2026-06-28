// LeetCode Problem 3217: Delete Nodes From Linked List Present in Array

import java.util.HashSet;

public class Solution3217 {

    // Node class of Linked List
    public static class ListNode {

        // Data Members
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

        // Insert
        public void insert(int data) {
            ListNode newNode = new ListNode(data);

            if (head == null) {
                head = newNode;
                return;
            }

            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Modified List
        public ListNode modifiedList(int[] nums, ListNode head) {

            // Create A Hash Set
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }

            // Create a dummy ListNode
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode curr = head;
            ListNode prev = dummy;

            // Compare
            while (curr != null) {
                if (set.contains(curr.val)) {
                    prev.next = curr.next;
                } else {
                    prev = curr;
                }
                curr = curr.next;
            }

            head = dummy.next;
            return head;
        }

        // Display
        public void display() {
            if (head != null) {
                ListNode temp = head;
                while (temp != null) {
                    System.out.print(temp.val + "-->");
                    temp = temp.next;
                }
                System.out.println("null");
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        // Create Object of classes
        Solution sol = new Solution();

        int[] nums = {1, 2, 3};
        int[] arr = {1, 2, 3, 4, 5};

        for (int h : arr) {
            sol.insert(h);
        }

        System.out.print("\nOriginal List: ");
        sol.display();

        sol.head = sol.modifiedList(nums, sol.head);

        System.out.print("After deletion: ");
        sol.display();
    }
}
