/**
 * Bubble Sort
 * 
 * Time Complexity:
 * Best Case    : O(n)   (Optimized) 
 * Average Case : O(n²)
 * Worst Case   : O(n²)
 *
 * Space Complexity:
 * O(1)
 *
 * Stable: Yes
 */

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop if array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
// output:
// Original Array:
// 64 34 25 12 22 11 90 
// Sorted Array:
// 11 12 22 25 34 64 90 
