// Breadth First Search(BFS) Algorithm Implementation In Java

import java.util.LinkedList;
import java.util.Queue;
public class LevelOrder_Traversal {
    // Node class
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

    // Method of level order traversal
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node currNode=queue.remove();
            if(currNode == null){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    queue.add(currNode.left);
                }
                if(currNode.right != null){
                    queue.add(currNode.right);
                }
            }
        }
    }

    // Main function
    public static void main(String[] args){
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("Root value of Binary Tree(BT): "+root.data);
        levelOrder(root);
    }
}
