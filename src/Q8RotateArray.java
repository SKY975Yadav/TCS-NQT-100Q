import java.util.Arrays;

public class Q8RotateArray {
    // Block swap Algorithm
    // Function to swap two sub arrays
    static void swap(int[] arr, int start1, int start2, int size) {
        for (int i = 0; i < size; i++) {
            int temp = arr[start1 + i];
            arr[start1 + i] = arr[start2 + i];
            arr[start2 + i] = temp;
        }
    }

    // Function to rotate array using block swap algorithm
    static void rotateUsingBlockSwap(int[] arr, int k) {
        int n = arr.length;
        if (k == 0 || k == n) return; // No rotation needed

        int A = k; // Size of first block
        int B = n - k; // Size of second block

        while (A != B) {
            if (A < B) { // Case 1: Block A is smaller
                swap(arr, k - A, k + B - A, A);
                B -= A;
            } else { // Case 2: Block B is smaller
                swap(arr, k - A, k, B);
                A -= B;
            }
        }
        // Final swap when both blocks are equal
        swap(arr, k - A, k, A);
    }


    //Reversal Algorithm for Array Rotation.
    // Function to reverse a portion of the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array using the Reversal Algorithm
    static void rotateUsingReversal(int[] arr, int d) {
        int n = arr.length;
        if (d == 0 || d == n) return; // No rotation needed

        // Step 1: Reverse first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse remaining n-d elements
        reverse(arr, d, n - 1);

        // Step 3: Reverse the whole array
        reverse(arr, 0, n - 1);
    }

    // Function to rotate the array to the right using Reversal Algorithm
    static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        if (d == 0 || d == n) return; // No rotation needed
        d = d % n; // Handle cases where d > n

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Step 3: Reverse the remaining n-d elements
        reverse(arr, d, n - 1);
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8};
        Arrays.stream(arr1).forEach(x-> System.out.print(x+" "));
        System.out.println();
        rotateUsingBlockSwap(arr1,5);
        Arrays.stream(arr1).forEach(x-> System.out.print(x+" "));

        System.out.println("\n");

        int [] arr2 = {1,2,3,4,5,6,7,8};
        Arrays.stream(arr2).forEach(x-> System.out.print(x+" "));
        System.out.println();
        rotateUsingReversal(arr2,5);
        Arrays.stream(arr2).forEach(x-> System.out.print(x+" "));

        System.out.println("\n");

        int [] arr3 = {1,2,3,4,5,6,7,8};
        Arrays.stream(arr3).forEach(x-> System.out.print(x+" "));
        System.out.println();
        rotateRight(arr3,5);
        Arrays.stream(arr3).forEach(x-> System.out.print(x+" "));
    }
}
