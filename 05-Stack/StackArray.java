;
/**
 * Stack Implementation using Array
 *
 * Operations:
 * - Push
 * - Pop
 * - Peek
 * - isEmpty
 * - isFull
 *
 * Time Complexity:
 * Push  : O(1)
 * Pop   : O(1)
 * Peek  : O(1)
 */


public class StackArray {

    private int[] stack;
    private int top;
    private int capacity;

    public StackArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int data) {

        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = data;
    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return stack[top--];
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return stack[top];
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top Element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        stack.display();
    }
}