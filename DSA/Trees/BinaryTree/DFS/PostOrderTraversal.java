// PostOrder Traversal Algorithm Implementation In Java

public class PostOrderTraversal {
    
    // Node class
    public static class Node{
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

    // BinaryTree builder
    static class BinaryTree{
        int index=-1;
        public Node buildTree(int[] nodes){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode=new Node(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    // Method to print the values in form of post order traversal
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("Root value of Binary Tree(BT): "+root.data);
        System.out.print("PostOrder Traversal: ");
        postorder(root);
    }
}

