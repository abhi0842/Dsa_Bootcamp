import java.util.Scanner;

public class Binary_Tree {
    public Binary_Tree() {

    }



    private static class Node {
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node: ");
        int data = scanner.nextInt();
        root = new Node(data);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of: " + node.data);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of: " + node.data);
            int data = scanner.nextInt();
            node.left = new Node(data);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter Right of: " + node.data);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the Right of: " + node.data);
            int data = scanner.nextInt();
            node.right = new Node(data);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(this.root, " ");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.data);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
public void arrowdisplay(){
        arrowdisplay(root,0 );
}
    private void arrowdisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        arrowdisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->" + node.data);
        } else {
            System.out.println(node.data);
        }
        arrowdisplay(node.left, level + 1);

    }
}

