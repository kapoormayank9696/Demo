// Insertion Sort List Algorithm Implementation In Java
public class Insertion_SortList {

    // Class Of ListNode
    public static class ListNode {

        // Public Access Modifier And Data Members
        public int val;
        public ListNode next;

        // Parameterized Constructor
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class LinkedList {
        public ListNode head = null;

        // Insert
        public void insert(int val) {
            ListNode newNode = new ListNode(val);
            if(head == null) {
                head = newNode;
                return;
            }

            ListNode temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Insertion Sort List 
        public ListNode insertionSortList(ListNode head) {
            ListNode helper = new ListNode(0);
            ListNode prev = helper;
            ListNode current = head;
            
            while(current != null) {
                ListNode next = current.next;
                while (prev.next != null && prev.next.val < current.val) { 
                    prev = prev.next;    
                }

                current.next = prev.next;
                prev.next = current;
                prev = helper;
                current = next;
            }

            return helper.next;
        }

        // Display
        public void display(ListNode head) {
            if(head != null) {
                ListNode temp = head;
                while(temp != null) {
                    System.out.print(temp.val+"-->");
                    temp = temp.next;
                }
                System.out.println("null");
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(4);
        list.insert(2);
        list.insert(1);
        list.insert(3);

        System.out.print("Original Linked List: ");
        list.display(list.head);

        list.head = list.insertionSortList(list.head);

        System.out.print("Sorted Linked List: ");
        list.display(list.head);
    }
}
