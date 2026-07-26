/**
 * Push Operation
 *
 * Time Complexity: O(1)
 */

public class Push {

    static final int SIZE = 5;

    static int[] stack = new int[SIZE];
    static int top = -1;

    public static void push(int data) {

        if (top == SIZE - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = data;

        System.out.println(data + " pushed into stack.");
    }

    public static void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        display();
    }
}
