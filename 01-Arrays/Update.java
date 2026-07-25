public class Update {

    public static void updateAtPosition(int[] arr, int size, int position, int item) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        arr[position] = item;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Before Update:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        updateAtPosition(arr, arr.length, 2, 99);

        System.out.println("After Update:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
// output:
// Before Update:
// 10 20 30 40 50 
// After Update:
// 10 20 99 40 50 