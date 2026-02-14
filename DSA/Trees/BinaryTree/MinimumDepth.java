// Minimum Depth Of Binary Tree Algorithm Implementation In Java
public class MinimumDepth {
    // Node class of Binary Tree
    @SuppressWarnings("unused")
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

    // class to find the root of Binary Tree(BT)
    static class BinaryTree{
        int index=-1;
        public Node buildTree(int[] nodes){
            index++;
            if(index >= nodes.length || nodes[index] == -1){
                return null;
            }
            Node newNode =new Node(nodes[index]);
            // Recursive Functions
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    // Method to find the Minimum Depth of Binary Tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);

        if(root.left == null){
            return rightheight+1;
        }
        if(root.right == null){
            return leftheight+1;
        }
        return Math.min(leftheight,rightheight)+1;
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes={3,9,20,-1,-1,15,7};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("Root of Binary Tree(BT) is: "+root.data);
        System.out.println("Minimum Depth of Binary Tree(BT): "+height(root));
    }
}
