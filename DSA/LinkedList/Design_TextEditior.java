// Design Text Editor Algorithm Implementation In Java

public class Design_TextEditior {

    // Node class of Singly Linked List
    public static class ListNode {

        // Default Access Modifier And Data Members
        char val;
        ListNode next;
        ListNode prev;

        // Parameterized Constructor
        public ListNode(char val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public static class TextEditor {

        public ListNode head = null;

        // Insert the nodes in the Singly Linked List
        public void insert(char val) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
            } else {
                ListNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        // Delete the last character from the text editor
        public void delete() {
            if (head == null) {
                return;
            }
            if (head.next == null) {
                head = null;
                return;
            }
            ListNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

        // Print the current text in the text editor
        public void printText() {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    // Main function
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        
        // Insert characters into the text editor
        textEditor.insert('H');
        textEditor.insert('e');
        textEditor.insert('l');
        textEditor.insert('l');
        textEditor.insert('o');
        
        // Print the current text
        System.out.print("Current Text: ");
        textEditor.printText(); // Output: Hello
        
        // Delete the last character
        textEditor.delete();
        
        // Print the current text after deletion
        System.out.print("After Deletion: ");
        textEditor.printText(); // Output: Hell
    }
}


