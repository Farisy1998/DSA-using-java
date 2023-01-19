package binaryTree;

public class Tree {
    private Node root = null;
    
    public class Node {
        private int data;
        private Node left;
        private Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void addNode(int data){
        Node newNode = new Node(data);

        if (isEmpty()) {
            root = newNode;
            root.left = null;
            root.right = null;
        }

        else {
            Node pointer = root;
            int level = 0;

            
        }
    }

    public boolean isEmpty() {
        return root == null ? true : false;
    }

    public void traverseDown() {
        if (isEmpty())
            throw new Error("Tree is empty");
        
        
    }
}
