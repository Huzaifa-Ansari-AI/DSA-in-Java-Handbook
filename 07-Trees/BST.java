/**
 * Binary Search Tree (BST)
 *
 * Rules:
 * - Left Child < Parent
 * - Right Child > Parent
 *
 * Operations:
 * - Insert
 * - Search
 * - Inorder Traversal
 *
 * Average Time Complexity:
 * Search : O(log n)
 * Insert : O(log n)
 * Traversal : O(n)
 */

public class BST {

    // Node of BST
    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root;

    // Insert a node into BST
    public Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Search a node in BST
    public boolean search(Node root, int key) {

        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);

        return search(root.right, key);
    }

    // Inorder Traversal
    public void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        BST tree = new BST();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("\n");

        int key = 60;

        if (tree.search(tree.root, key)) {
            System.out.println(key + " found in BST.");
        } else {
            System.out.println(key + " not found in BST.");
        }
    }
} 