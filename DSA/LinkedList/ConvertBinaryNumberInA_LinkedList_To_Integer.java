// Convert Binary Number in a Linked List to Integer Algorithm Implementation In Java
public class ConvertBinaryNumberInA_LinkedList_To_Integer {
    
    // Class Of Listnode
    public static class ListNode {
        // Public Access Specifier
        public int val;
        public ListNode next;
        public ListNode prev;


        // Parameterized Constructor
        public ListNode(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // Get Decimal Value function
    public static int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }

        int sum = 0;
        ListNode temp = head;

        while (temp != null) {
            sum = sum * 2 + temp.val;
            temp = temp.next;
        }

        return sum;
    }

    // Main function
    public static void main(String[] args) {
        // Creating Linked List: 1 -> 0 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

        // Display Linked List
        System.out.print("Binary Number: ");

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        // Get Decimal Value
        System.out.println("\nDecimal Value: " + getDecimalValue(head));
    }  
}
