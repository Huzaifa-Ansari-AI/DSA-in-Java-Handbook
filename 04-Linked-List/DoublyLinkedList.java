/**
 * Doubly Linked List
 *
 * Operations:
 * - Insertion at End
 * - Forward Traversal
 * - Backward Traversal
 *
 * Time Complexity:
 * Traversal : O(n)
 * Insertion : O(n)
 */

public class DoublyLinkedList {

    static class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;

    // Insert at end
    public void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Forward Traversal
    public void displayForward() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");

            if (temp.next == null)
                break;

            temp = temp.next;
        }

        System.out.println("null");
    }

    // Backward Traversal
    public void displayBackward() {

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Forward Traversal:");
        list.displayForward();

        System.out.println("Backward Traversal:");
        list.displayBackward();
    }
}
// Output:
// Forward Traversal:
// 10 <-> 20 <-> 30 <-> 40 <-> null
// Backward Traversal:
// 40 <-> 30 <-> 20 <-> 10 <-> null