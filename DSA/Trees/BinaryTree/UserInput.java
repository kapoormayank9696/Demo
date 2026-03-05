import java.util.Scanner;

public class UserInput {
    // Class Node Of Binary Tree(BT)
    public static class Node {
        // Default Access Modifier And Data Members
        int data;
        Node left;
        Node right;
        // Parameterized Constructor
        public Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    // Function to print the Binary Tree In PreOrder Traversal
     public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        // Recursive Calls
        preOrder(root.left); // Left Subtree
        preOrder(root.right); // Right Subtree
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    // Main function
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int t = scan.nextInt();
        Node root = null;
        System.out.print("Enter nodes: ");
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        System.out.print("Preorder traversal: ");
        preOrder(root);
        scan.close();
    }	
}
