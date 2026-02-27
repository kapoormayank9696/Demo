// Level Order Traversal node print From BST Algorithm Implementation In Java
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder_BST{
    // Node class of BST
    @SuppressWarnings("unused")
    public static class Node{
        // Defalut Access Modifier And Data Members
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

    // Function to insert the nodes in Binary Search Tree(BST)
    public static Node insert(Node root,int val) {
        if(root == null) {
            return new Node(val);
        }
        // Recursion Function
        if(root.data > val) {
            // Left Subtree
            root.left=insert(root.left,val);
        }
        if(root.data < val) {
            // Right Subtree
            root.right=insert(root.right, val);
        }
        return root;
    }

    // Function to print nodes of Binary Search Tree(BSt)
    public static void print(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        print(root.left); // Left Subtree
        print(root.right); //Right Subtree
    }

    // Function to perform the level order traversal
    public static void levelOrder_Traversal(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()) {
            Node currNode=queue.remove();
            if(currNode == null){
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    queue.add(currNode.left);
                }
                if(currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] nums={50,30,80,25,20,70,75,110,100,90,65};
        Node root=null;
        for(int num:nums) {
            root=insert(root,num);
        }
        System.out.print("Print Nodes of Binary Search Tree(BST): ");
        print(root);
        System.out.print("\nLevel-order traversal of BST:");
        levelOrder_Traversal(root);
    }
}
