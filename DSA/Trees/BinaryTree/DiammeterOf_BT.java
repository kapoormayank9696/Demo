// Diammeter of Binary Tree Algorithm Implementation In Java

public class DiammeterOf_BT {

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

    // Main function
    public static void main(String[] args) {
        int[] nodes={50,30,20,-1,25,80,70,65,-1,-1,75,-1,-1,100,90,110,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("Root of Binary Tree(BT): "+root.data);
    }    
}
