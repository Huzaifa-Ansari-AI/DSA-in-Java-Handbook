/**
 * Stack Overflow
 *
 * Overflow occurs when a push operation is performed
 * on a stack that is already full.
 *
 * Time Complexity: O(1)
 */

public class Overflow {

    static final int SIZE = 3;

    static int[] stack = new int[SIZE];
    static int top = -1;

    public static void push(int data) {

        if (top == SIZE - 1) {
            System.out.println("Stack Overflow! Cannot insert " + data);
            return;
        }

        stack[++top] = data;
        System.out.println(data + " inserted.");
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
        push(30);

        // Causes Overflow
        push(40);

        display();
    }
}