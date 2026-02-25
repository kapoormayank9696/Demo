// InOrder Traversal of a Binary Search Tree (BST) Algorithm Implementation In Java

public class Inorder {

    // Node class of Binary Search Tree(BST)
    public static class Node{
        // Default Access Modifier And Data Members
        int data;
        Node left;
        Node right;
        // Parameterized Constructor
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    // Function To Build Binary Search Tree(BST) From An Array
    public static Node insert(Node root,int val){
        if(root == null){
            root=new Node(val);
            return root;
        }
        if(root.data > val){
            // Left Subtree
            root.left=insert(root.left,val);
        }
        else{
            // Right Subtree
            root.right=insert(root.right,val);
        }
        return root;
    }

    // Function To Print Binary Search Tree(BST) Inorder Traversal
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // Main function
    public static void main(String[] args) {
        int[] values={5, 1, 3, 4, 2, 7, 6, 8};
        Node root=null;
        for(int num:values) {
            root=insert(root,num);
        }
        System.out.print("Inorder Traversal Of The Binary Search Tree(BST) Is: ");
        inorder(root);
    }
}
