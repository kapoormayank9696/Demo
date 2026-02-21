// Right Side View of Binary Tree Algorithm Implementation In Java
// Time Complexity of Approach is: 0(n)

public class RightSideView {
    // Node class of Binary Tree(BT)
    @SuppressWarnings("unused")
    public static class Node{
        // Default Access Modifier And Data Members
        int data;
        Node left;
        Node right;
        // Parameterized Constructor
        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // class to find the root of Binary Tree(BT)
    public static class BinaryTree{
        int index=-1;
        public Node buildTree(int[] nodes) {
            index++;
            if(index >= nodes.length || nodes[index] == -1){
                return null;
            }
            Node newNode=new Node(nodes[index]);
            // Recursive function
            newNode.left=buildTree(nodes); // for left side of Binary Tree
            newNode.right=buildTree(nodes); // for right side of Binary Tree
            return newNode;
        }
    }

    // Function to find the right side view of Binary Tree(BT)
    public static void rightSideView(Node root){
        if(root == null){
            return;
        }
        // Recursive function
        System.out.print(root.data+" ");
        rightSideView(root.right); // for right side of Binary Tree
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes={5,3,1,-1,-1,4,-1,-1,7,6,-1,-1,8,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("Root of the Binary Tree is: "+root.data);
        System.out.println("Right Side View of Binary Tree is: ");
        rightSideView(root);
    }
}
