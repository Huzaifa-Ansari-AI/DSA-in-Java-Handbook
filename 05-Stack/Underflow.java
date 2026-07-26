/**
 * Stack Underflow
 *
 * Underflow occurs when a pop operation is performed
 * on an empty stack.
 *
 * Time Complexity: O(1)
 */

public class Underflow {

    static final int SIZE = 3;

    static int[] stack = new int[SIZE];
    static int top = -1;

    public static void push(int data) {

        if (top == SIZE - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = data;
    }

    public static int pop() {

        if (top == -1) {
            System.out.println("Stack Underflow! Stack is Empty.");
            return -1;
        }

        return stack[top--];
    }

    public static void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("\nCurrent Stack:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        push(10);
        push(20);

        display();

        System.out.println("\nPopped: " + pop());
        System.out.println("Popped: " + pop());

        // Causes Underflow
        System.out.println("Popped: " + pop());

        display();
    }
}
