public class Deletion {

    public static int deleteAtPosition(int[] arr, int size, int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return size;
        }

        for (int i = position; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return size - 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        int size = 5;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Before Deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        size = deleteAtPosition(arr, size, 2);

        System.out.println("After Deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
// Output:
// Before Deletion:
// 10 20 30 40 50 
// After Deletion:
// 10 20 40 50 
