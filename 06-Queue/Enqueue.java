/**
 * Enqueue Operation
 *
 * Time Complexity: O(1)
 */

public class Enqueue {

    static final int SIZE = 5;

    static int[] queue = new int[SIZE];
    static int front = 0;
    static int rear = -1;

    public static boolean isFull() {
        return rear == SIZE - 1;
    }

    public static void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        queue[++rear] = data;

        System.out.println(data + " inserted into the queue.");
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

        display();
    }
}
