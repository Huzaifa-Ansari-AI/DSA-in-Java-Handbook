public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array Basics");
        System.out.println("Length: " + arr.length);
        System.out.println("Elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " = " + arr[i]);
        }
    }
}
// Output:
// Array Basics
// Length: 5
// Elements:
// Index 0 = 10
// Index 1 = 20
// Index 2 = 30
// Index 3 = 40
// Index 4 = 50