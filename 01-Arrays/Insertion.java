public class Insertion {

    public static int insertAtPosition(int[] arr, int size, int position, int item) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return size;
        }

        if (size >= arr.length) {
            System.out.println("Array is full. Insertion not possible.");
            return size;
        }

        for (int i = size - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }

        arr[position] = item;
        return size + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        int size = 5;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Before Insertion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        size = insertAtPosition(arr, size, 2, 99);

        System.out.println("After Insertion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Output:
// Before Insertion:
// 10 20 30 40 50 
// After Insertion:
// 10 20 99 30 40 50 