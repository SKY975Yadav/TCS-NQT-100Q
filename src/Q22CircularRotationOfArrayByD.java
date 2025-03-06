public class Q22CircularRotationOfArrayByD {

    // Function to rotate the array using the Reversal Algorithm
    static void rotateUsingReversal(int[] arr, int d) {
        int n = arr.length;
        if (d == 0 || d == n) return; // No rotation needed
        d = d % n;

        // d = n-d ,simple right rotation
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
        d = d % n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Step 3: Reverse the remaining n-d elements
        reverse(arr, d, n - 1);
    }

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

    public static void main(String[] args) {

    }
}
