// largest element in array
public class Q2LargestElementInArray {
    public static int largestInAnArray(int[] arr) {
        int large = arr[0];  // Initialize with the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }

    public static int indOfLargestInAnArray(int[] arr) {
        int large = arr[0], ind = 0;  // Initialize with the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
                ind = i;
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        int[] arr = {23, 12, 11, 16, 8, 19, 51};
        System.out.println("Largest element: " + largestInAnArray(arr));
        System.out.println("Index of Largest element: " + indOfLargestInAnArray(arr));
    }
}
