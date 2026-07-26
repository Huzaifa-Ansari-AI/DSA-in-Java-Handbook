package Queue;

/**
 * Dequeue Operation
 *
 * Time Complexity: O(1)
 */

public class Dequeue {

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

    public static int dequeue() {

        if (rear < front) {
            System.out.println("Queue Underflow");
            return -1;
        }

        return queue[front++];
    }

    public static void display() {

        if (rear < front) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        System.out.println("Original Queue:");
        display();

        System.out.println("Dequeued Element: " + dequeue());

        System.out.println("Queue After Dequeue:");
        display();
    }
}
