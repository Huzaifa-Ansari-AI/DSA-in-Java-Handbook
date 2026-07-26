package Queue;
/**
 * Queue Traversal
 *
 * Time Complexity: O(n)
 */

public class Traversal2 {

    static final int SIZE = 5;

    static int[] queue = new int[SIZE];
    static int front = 0;
    static int rear = -1;

    public static void enqueue(int data) {

        if (rear == SIZE - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        queue[++rear] = data;
    }

    public static void traverse() {

        if (rear < front) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Traversing Queue:");

        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        traverse();
    }
}
