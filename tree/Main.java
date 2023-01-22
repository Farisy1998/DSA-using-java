package tree;

public class Main {
    public static void main(String[] args) {
        String level = "    ";

        Node root = new Node(10);
        level += "    ";

        Node left = new Node(20);
        root.left = left;
        level += "    ";
        
        Node right = new Node(30);
        root.right = right;
        level += "    ";

        Node leftLeft = new Node(40);
        root.left.left = leftLeft;
        level += "    ";

        Node leftRight = new Node(50);
        root.left.right = leftRight;
        level += "    ";

        Node rightLeft = new Node(60);
        root.right.left = rightLeft;
        level += "    ";

        Node rightRight = new Node(70);
        root.right.right = rightRight;
        level += "    ";
        
        System.out.println(level + root.data + "\n");
        System.out.println(
                level.substring(0, level.length() / 2) + root.left.data + level + root.right.data + "\n");
        System.out.println(level.substring(0, level.length() / 4) + root.left.left.data
                + level.substring(0, level.length() / 2) + root.left.right.data + level.substring(0, level.length() / 2)
                + root.right.left.data + level.substring(0, level.length() / 2) + root.right.right.data + "\n");
    }
}
