// Daimeter of Node Algorithm Implementation In Java
// Time Complexity of Approach2 is: 0(n)

public class DiameterOf_BT2 {
    
    // Node class
    @SuppressWarnings("unused")
    static class Node{
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
    static class BinaryTree{
        int index=-1;
        public Node buildTree(int[] nodes){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode=new Node(nodes[index]);
            // Recursive function
            newNode.left=buildTree(nodes); // for left side of Binary Tree
            newNode.right=buildTree(nodes); // for right side of Binary Tree
            return newNode;
        }
    }

    // class to store the height, diameter of Binary Tree(BT)
    @SuppressWarnings("unused")
    static class TreeInfo{
        // Deafult Access Modifier And Data Members
        int height;
        int diameter;
        // Parameterized Constructor
        public TreeInfo(int height, int diameter){
            this.height=height;
            this.diameter=diameter;
        }
    }

    // Function to take the height ,diameter from class
    public static TreeInfo diameter(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);
        int myHeight = Math.max(left.height, right.height)+1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1;
        int mydiam=Math.max(Math.max(diam1,diam2), diam3);

        TreeInfo myInfo=new TreeInfo(myHeight, mydiam);
        return myInfo;
    }
    // Main function
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("Root of Binary Tree(BT): "+root.data);
        System.out.println("Diameter of Binary Tree(BT): "+diameter(root).diameter);
    }
}
