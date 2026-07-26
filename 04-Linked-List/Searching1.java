/**
 * Linked List Searching
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Searching1 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Insert node at the end
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
    }

    // Search for an element
    public boolean search(int key) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {

        Searching1 list = new Searching1();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        int key = 30;

        if (list.search(key)) {
            System.out.println(key + " found in the linked list.");
        } else {
            System.out.println(key + " not found.");
        }
    }
}

// 30 found in the linked list.