// Diammeter of Binary Tree Algorithm Implementation In Java
// Time Complexity of Approach1 is 0(n^2)

public class DiameterOf_BT1 {

    // class node of Binary Tree
    @SuppressWarnings("unused")
    static class Node{
        // Default Access Modifier and Data Memebers
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

    // class to find the root of Binary Tree(BT)
    static class BinaryTree{
        int index=-1;
        public Node buildTree(int[] nodes){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode=new Node(nodes[index]);
            // Recursive Function
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    
    // Function to find the Height of Binary Tree(BT)
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int myheight=Math.max(leftHeight,rightHeight)+1;
        return myheight;
    }

    // Function to find the Diameter of Binary Tree(BT)
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        // Recursive function use for finding the diameter of Binary Tree(BT)
        int diam1= diameter(root.left);
        int diam2= diameter(root.right);
        int diam3=height(root.left) + height(root.right) + 1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("Root of Binary Tree(BT): "+root.data);
        System.out.println("Diameter of Binary Tree(BT): "+diameter(root));
    }    
}
