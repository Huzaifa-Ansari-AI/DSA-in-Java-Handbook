/**
 * Queue Implementation using Array
 *
 * Operations:
 * - Enqueue
 * - Dequeue
 * - Peek
 * - isEmpty
 * - isFull
 *
 * Time Complexity:
 * Enqueue : O(1)
 * Dequeue : O(1)
 * Peek    : O(1)
 */
package Queue;
public class QueueArray {

    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear < front;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        queue[++rear] = data;
    }

    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        return queue[front++];
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return queue[front];
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Queue Elements:");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueArray queue = new QueueArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Dequeued: " + queue.dequeue());

        queue.display();
    }
}