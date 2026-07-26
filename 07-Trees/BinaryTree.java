/**
 * Binary Tree
 *
 * A Binary Tree is a tree in which each node has
 * at most two children: left and right.
 *
 * Time Complexity:
 * Traversal : O(n)
 */

public class BinaryTree {

    // Node of Binary Tree
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

    // Inorder Traversal
    public void inorder(Node node) {

        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        // Creating the Binary Tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
    }
}