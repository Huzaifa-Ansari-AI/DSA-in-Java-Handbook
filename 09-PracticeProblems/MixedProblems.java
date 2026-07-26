/**
 * Mixed DSA Practice Problems
 *
 * This program demonstrates the most important DSA operations
 * in one file using Java.
 *
 * Topics Covered:
 * 1. Array Traversal
 * 2. Linear Search
 * 3. Bubble Sort
 * 4. Stack (Push & Pop)
 * 5. Queue (Enqueue & Dequeue)
 *
 * This file is intended for practice purposes only.
 */

public class MixedProblems {

    // =============================
    // Array Traversal
    // =============================
    static void traverseArray(int[] arr) {

        System.out.print("Array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    // =============================
    // Linear Search
    // =============================
    static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    // =============================
    // Bubble Sort
    // =============================
    static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    // =============================
    // Stack
    // =============================
    static class Stack {

        int[] stack = new int[5];
        int top = -1;

        void push(int value) {

            if (top == stack.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }

            stack[++top] = value;
        }

        int pop() {

            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }

            return stack[top--];
        }
    }

    // =============================
    // Queue
    // =============================
    static class Queue {

        int[] queue = new int[5];
        int front = 0;
        int rear = -1;

        void enqueue(int value) {

            if (rear == queue.length - 1) {
                System.out.println("Queue Overflow");
                return;
            }

            queue[++rear] = value;
        }

        int dequeue() {

            if (rear < front) {
                System.out.println("Queue Underflow");
                return -1;
            }

            return queue[front++];
        }
    }

    // =============================
    // Main Method
    // =============================
    public static void main(String[] args) {

        // Array
        int[] arr = {40, 10, 50, 20, 30};

        traverseArray(arr);

        // Linear Search
        int key = 20;

        int index = linearSearch(arr, key);

        if (index != -1)
            System.out.println(key + " found at index " + index);
        else
            System.out.println(key + " not found.");

        // Bubble Sort
        bubbleSort(arr);

        System.out.println("\nSorted Array:");
        traverseArray(arr);

        // Stack
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nStack Pop: " + stack.pop());

        // Queue
        Queue queue = new Queue();

        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);

        System.out.println("Queue Dequeue: " + queue.dequeue());
    }
}