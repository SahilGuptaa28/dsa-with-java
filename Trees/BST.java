import java.util.*;

public class BST {

    private class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // 🔹 INSERT
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }

        return node;
    }

    // 🔹 SEARCH
    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(Node node, int value) {
        if (node == null) return false;

        if (value == node.value) return true;

        if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    // 🔹 INORDER (Sorted Output)
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    // 🔹 MAIN
    public static void main(String[] args) {
        BST tree = new BST();

        int[] values = {5, 3, 7, 2, 4, 6, 8};

        for (int v : values) {
            tree.insert(v);
        }

        System.out.print("Inorder (sorted): ");
        tree.inorder();

        System.out.println("Search 4: " + tree.search(4));
        System.out.println("Search 10: " + tree.search(10));
    }
}