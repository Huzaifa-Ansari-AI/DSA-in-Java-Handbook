/**
 * Linked List Deletion
 *
 * Operations:
 * - Delete from Beginning
 * - Delete by Value
 *
 * Time Complexity:
 * Beginning : O(1)
 * By Value  : O(n)
 */

public class Deletion1 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

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

    public void deleteFirst() {

        if (head != null) {
            head = head.next;
        }
    }

    public void deleteByValue(int value) {

        if (head == null)
            return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Deletion1 list = new Deletion1();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original List:");
        list.display();

        list.deleteFirst();

        System.out.println("After Deleting First Node:");
        list.display();

        list.deleteByValue(30);

        System.out.println("After Deleting 30:");
        list.display();
    }
}
// Output:
// Original List:
// 10 -> 20 -> 30 -> 40 -> null
// After Deleting First Node:
// 20 -> 30 -> 40 -> null
// After Deleting 30:
// 20 -> 40 -> null