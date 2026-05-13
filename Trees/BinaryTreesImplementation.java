import java.util.Scanner;
import org.w3c.dom.Node;

public class BinaryTreesImplementation {

    private Node root;

    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(Scanner s) {
        System.out.print("Enter root value: ");
        int value = s.nextInt();
        root = new Node(value);
        insert(s, root);
    }

    public void insert(Scanner s, Node node) {

        // LEFT
        System.out.print("Insert left of " + node.value + "? (true/false): ");
        boolean left = s.nextBoolean();

        if (left) {
            System.out.print("Enter value: ");
            int value = s.nextInt();
            node.left = new Node(value);
            insert(s, node.left);
        }

        // RIGHT
        System.out.print("Insert right of " + node.value + "? (true/false): ");
        boolean right = s.nextBoolean();

        if (right) {
            System.out.print("Enter value: ");
            int value = s.nextInt();
            node.right = new Node(value);
            insert(s, node.right);
        }
    }

    public void display(Node node) {
        if (node == null) return;

        System.out.print(node.value + " ");
        display(node.left);
        display(node.right);
    }

    public void display() {
        display(root);
    }

    public static void main(String[] args) {
        BinaryTreesImplementation tree = new BinaryTreesImplementation();
        Scanner s = new Scanner(System.in);

        tree.insert(s);
        System.out.println("Tree (Preorder):");
        tree.display();

        s.close();
    }
}