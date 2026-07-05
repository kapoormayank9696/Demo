// Design SkipList Algorithm Implementation In Java

public class Design_SkipList {

    // ListNode class
    public static class ListNode {
        // Public Access Modifier And Data Memebers

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

    public static class Skiplist {

        // Public Access Modifier And Data Members
        public ListNode current = null;

        // Default Constructor
        public Skiplist() {
        }

        // Search Method
        public boolean search(int target) {
            ListNode temp = current;

            while (temp != null) {
                if (temp.val == target) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        // Add Method
        public void add(int num) {
            ListNode newNode = new ListNode(num);
            if (current == null) {
                current = newNode;
                return;
            }

            ListNode temp = current;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Erase Method
        public boolean erase(int num) {
            ListNode prev = null;
            ListNode temp = current;

            while (temp != null) {
                if (temp.val == num) {

                    if (prev == null) {
                        current = temp.next;
                    } else {
                        prev.next = temp.next;
                    }
                    return true;
                }
                prev = temp;
                temp = temp.next;
            }
            return false;
        }

        // Display Method
        public void display() {
            ListNode temp = current;
            while (temp != null) {
                System.out.print(temp.val + "-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // Main Method
    public static void main(String[] args) {
        Skiplist skiplist = new Skiplist();
        skiplist.add(1);
        skiplist.add(2);
        skiplist.add(3);
        System.out.print("Display SkipList Elements: ");
        skiplist.display();

        System.out.println("Search 0: " + skiplist.search(0));   // return False
        skiplist.add(4);

        System.out.print("Display SkipList Elements: ");
        skiplist.display();

        System.out.println("Search 1: " + skiplist.search(1));   // return True
        System.out.println("Erase 0: " + skiplist.erase(0));    // return False, 0 is not
        System.out.println("Erase 1: " + skiplist.erase(1));    // return True
        System.out.println("Search 1: " + skiplist.search(1));   // return False

        System.out.print("Display SkipList Elements: ");
        skiplist.display();
    }

}
