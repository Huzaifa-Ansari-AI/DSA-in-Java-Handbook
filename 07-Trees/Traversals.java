/**
 * Tree Traversals
 *
 * Types of Traversal:
 * 1. Preorder  : Root -> Left -> Right
 * 2. Inorder   : Left -> Root -> Right
 * 3. Postorder : Left -> Right -> Root
 *
 * Time Complexity:
 * All Traversals : O(n)
 *
 * Space Complexity:
 * O(h)
 * (where h is the height of the tree)
 */

public class Traversals {

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

    // Preorder Traversal
    public void preorder(Node node) {

        if (node == null)
            return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder Traversal
    public void inorder(Node node) {

        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder Traversal
    public void postorder(Node node) {

        if (node == null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {

        Traversals tree = new Traversals();

        // Creating Binary Tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder Traversal:");
        tree.preorder(tree.root);

        System.out.println("\n");

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("\n");

        System.out.println("Postorder Traversal:");
        tree.postorder(tree.root);
    }
}

// This implementation covers the 80/20 of tree traversals:

// ✅ Preorder Traversal
// ✅ Inorder Traversal
// ✅ Postorder Traversal
// ✅ Time & Space Complexity
// ✅ Simple binary tree construction
// ✅ Ready to compile and upload to GitHub as Traversals.java.