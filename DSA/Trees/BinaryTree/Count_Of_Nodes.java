// Count ogf Nodes Algorithm Implementation In Java
// Time Complexity 0(n)

public class Count_Of_Nodes{

    // Node class of Binary Tree(BT)
    @SuppressWarnings("unused")
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

    // class of Binary Tree to find the root of BT
    static class BinaryTree{
        int index=-1;
        public Node buildTree(int[] nodes){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    // Method to count the number of nodes
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes+ rightNodes +1;
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("Root of Binary Tree(BT): "+root.data);
        System.out.println("Number of nodes in Binary Tree(BT): "+countOfNodes(root));
    }
}

