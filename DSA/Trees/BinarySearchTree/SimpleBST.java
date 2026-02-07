// Simple Binary Search Tree Algorithm Implementation In Java

public class SimpleBST {
    // Node class for Binary Search Tree(BST)
    static class Node{
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

    // Main function
    public static void main(String[] args) {
        // Call the BST(Node)
        Node root=new Node(23);
        root.left=new Node(16);
        root.right=new Node(30);
        root.left.left=new Node(2);
        root.left.right=new Node(20);
        root.right.left=new Node(28);
        root.right.right=new Node(35);

        System.out.println("    "+root.data);
        System.out.println("   /  \\");
        System.out.println("  "+root.left.data+"   "+root.right.data);
        System.out.println(" / \\ "+"  / \\");
        System.out.println(root.left.left.data+"   "+root.left.right.data+" "+root.right.left.data+" "+root.right.right.data);
    }
}


