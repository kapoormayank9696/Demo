// Height Of Binary Tree Algorithm Implementation In Java

public class HeightOf_BT {

    // Node class of Binary Tree
    @SuppressWarnings("unused")
    static class Node{
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

    // class to find the root of Binary Tree(BT)
    static class BinaryTree{
        int index=-1;
        public Node buildTree(int[] nodes){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode =new Node(nodes[index]);
            // Recursive Functions
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    // Method to find the Height of Binary Tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        int myHeight=Math.max(leftheight,rightheight)+1;
        return myHeight;
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("Root of Binary Tree(BT) is: "+root.data);
        System.out.println("Height of Binary Tree(BT): "+height(root));
    }
}
