public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        int key = 50;

        int index = binarySearch(arr, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

    }
}
// output:
// Element found at index: 4