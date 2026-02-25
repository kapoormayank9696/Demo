// Post Order Traversal of a Binary Search Tree (BST) Algorithm Implementation in Java

public class PostOrder {
    
    // Node class of Binary Search Tree(BST)
    public static class Node{
        // Default Access Modifier and Data Members
        int data;
        Node left;
        Node right;
        // Parameterized Constructor
        public Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    // Function to insert the values in the Binary Search Tree
    public static Node insert(Node root, int val) {
        if(root == null) {
            root=new Node(val);
            return root;
        }
        if(root.data > val){
            // Left Subtree
            root.left=insert(root.left,val);
        }
        if(root.data < val){
            // Right Subtree
            root.right=insert(root.right,val);
        }
        return root;
    }

    // Function to print Binary Search Tree in Post Order Traversal
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // Main function
    public static void main(String[] args) {
        int[] values = {5,12,18,23,37,42,56};
        Node root = null;
        for(int num:values){
            root=insert(root,num);
        }
        System.out.print("Post Order Traversal: ");
        postOrder(root);
    }    
}
