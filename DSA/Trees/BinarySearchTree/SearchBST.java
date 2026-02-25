// Searching In Binary Search Tree Algorithm Implementation In Java

public class SearchBST {
    // Node class of Binary Search Tree
    public static class Node {
        // Deafult Access Modifier And Data Members
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

    // Method to insert the values in Binary Search Tree
    public static Node insert(Node root,int val){
        if(root == null) {
            root= new Node(val);
            return root;
        }
        if(root.data > val){
            // Left Subtree
            root.left=insert(root.left, val);
        }
        else{
            // Right Subtree
            root.right=insert(root.right, val);
        }
        return root;
    }

    // Method to print the values in form of pre order traversal
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // Method to search the value in Binary Search Tree
    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        // Recursive calls for left and right subtree
        else if(root.data > key){
            // Left Subtree
            return search(root.left, key);
        }
        else{
            // Right Subtree
            return search(root.right, key);
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] nums={5,3,7,2,4,6,8};
        Node root=null;
        for(int num:nums){
            root=insert(root, num);
        }
        System.out.print("Preorder Traversal:");
        preorder(root);
        int key=4;
        if(search(root, key)){
            System.out.println("\n"+key+" is found in the Binary Search Tree(BST).");
        }
        else{
            System.out.println("\n"+key+" is not found in the Binary Search Tree(BST).");
        }
    }
}

