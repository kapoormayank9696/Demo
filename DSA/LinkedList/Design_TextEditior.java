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
        public ListNode cursor = null;

        public TextEditor() {
            head = new ListNode('#');
            cursor = head;
        }

        public void addText(String text) {
            for (char c : text.toCharArray()) {
                ListNode node = new ListNode(c);
                node.prev = cursor;
                node.next = cursor.next;

                if (cursor.next != null) {
                    cursor.next.prev = node;
                }

                cursor.next = node;
                cursor = node;
            }
        }

        public int deleteText(int k) {
            int deleted = 0;

            while (cursor != head && deleted < k) {
                ListNode prev = cursor.prev;

                prev.next = cursor.next;
                if (cursor.next != null) {
                    cursor.next.prev = prev;
                }

                cursor = prev;
                deleted++;
            }
            return deleted;
        }

        public String cursorLeft(int k) {
            while (cursor != head && k > 0) {
                cursor = cursor.prev;
                k--;
            }
            return getLast10();
        }

        public String cursorRight(int k) {
            while (cursor.next != null && k > 0) {
                cursor = cursor.next;
                k--;
            }
            return getLast10();
        }

        public String getLast10() {
            StringBuilder sb = new StringBuilder();

            ListNode temp = cursor;
            int count = 0;

            while (temp != head && count < 10) {
                sb.append(temp.val);
                temp = temp.prev;
                count++;
            }

            return sb.reverse().toString();
        }

        // Print the current text in the text editor
        public void printText() {
            ListNode temp = head.next;
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
        textEditor.addText("Hello");

        // Print the current text
        System.out.print("Current Text: ");
        textEditor.printText(); // Output: Hello

        // Delete the last character
        textEditor.deleteText(1);

        // Print the current text after deletion
        System.out.print("After Deletion: ");
        textEditor.printText(); // Output: Hell
    }
}
