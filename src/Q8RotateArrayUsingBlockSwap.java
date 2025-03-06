import java.util.Arrays;

public class Q8RotateArrayUsingBlockSwap {
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
        k = k % n;

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

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.stream(arr1).forEach(x -> System.out.print(x + " "));
        System.out.println();
        rotateUsingBlockSwap(arr1, 5);
        Arrays.stream(arr1).forEach(x -> System.out.print(x + " "));

    }
}
