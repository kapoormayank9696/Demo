// Design Browser History Algorithm Implementation In Java

public class Design_Browser_History {

    // ListNode Class
    public static class ListNode {

        // Public Access Modifier And Data Members
        public String url;
        public ListNode next;
        public ListNode prev;

        // Parameterized Constructor
        public ListNode(String url) {
            this.url = url;
            this.next = null;
            this.prev = null;
        }
    }

    // BrowserHistory Class
    public static class BrowserHistory {

        public ListNode current;

        // Constructor`
        public BrowserHistory(String homepage) {
            current = new ListNode(homepage);
        }

        // Visit Operation
        public void visit(String url) {
            ListNode newNode = new ListNode(url);

            current.next = null;
            newNode.prev = current;
            current.next = newNode;

            current = newNode;
        }

        // Back Operation
        public String back(int steps) {
            while (steps > 0 && current.prev != null) {
                current = current.prev;
                steps--;
            }
            return current.url;
        }

        // Forward Operation
        public String forward(int steps) {
            while (steps > 0 && current.next != null) {
                current = current.next;
                steps--;
            }

            return current.url;
        }

        // Display Operation
        public void display() {
            ListNode temp = current;
            while (temp.prev != null) {
                temp = temp.prev;
            }

            System.out.print("Browser History: ");
            while (temp != null) {
                System.out.print(temp.url + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // Main function
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        browserHistory.display();

        System.out.println("\nBack 1: " + browserHistory.back(1)); // facebook.com
        System.out.println("Back 1: " + browserHistory.back(1)); // google.com
        System.out.println("Forward 1: " + browserHistory.forward(1)); // facebook.com
        browserHistory.visit("linkedin.com");
        browserHistory.display();

        System.out.println("\nForward 2: " + browserHistory.forward(2)); // linkedin.com
        System.out.println("Back 2: " + browserHistory.back(2)); // google.com
        System.out.println("Back 7: " + browserHistory.back(7)); // leetcode.com
    }
}
