//Smallest element in array
public class Q1SmallestElementInArray {

    public static int smallestInAnArray(int[] arr) {
        int small = arr[0];  // Initialize with first element (safer than Integer.MAX_VALUE)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }

    public static int indOfSmallestInAnArray(int[] arr) {
        int small = arr[0], ind = 0;  // Initialize with first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
                ind = i;
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        int [] arr = {23,12,11,16,8,19,51};
        System.out.println(smallestInAnArray(arr));
        System.out.println(indOfSmallestInAnArray(arr));
    }
}
