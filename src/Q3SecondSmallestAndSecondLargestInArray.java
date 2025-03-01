//Second smallest and second largest
public class Q3SecondSmallestAndSecondLargestInArray {

    public static int secondSmallestInArray(int [] arr){
        int n = arr.length;
        if (n < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int firstSmall = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < firstSmall) {
                secondSmall = firstSmall;
                firstSmall = arr[i];
            } else if (arr[i] > firstSmall && arr[i] < secondSmall) {
                secondSmall = arr[i];
            }
        }

        return (secondSmall == Integer.MAX_VALUE) ? -1 : secondSmall;

    }

    public static int secondLargestInArray(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int firstLarge = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLarge) {
                secondLarge = firstLarge;
                firstLarge = arr[i];
            } else if (arr[i] < firstLarge && arr[i] > secondLarge) {
                secondLarge = arr[i];
            }
        }

        return (secondLarge == Integer.MIN_VALUE) ? -1 : secondLarge;  // -1 if no second largest
    }

    public static int indOfSecondSmallestInArray(int [] arr){
        int n = arr.length;
        if (n < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int firstSmall = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;
        int firstInd = -1, secondInd = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] < firstSmall) {
                secondSmall = firstSmall;
                secondInd = firstInd;
                firstSmall = arr[i];
                firstInd = i;
            } else if (arr[i] > firstSmall && arr[i] < secondSmall) {
                secondSmall = arr[i];
                secondInd = i;
            }
        }

        return secondInd;

    }

    public static int indexOfSecondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int firstLarge = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;
        int firstInd = -1, secondInd = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLarge) {
                secondLarge = firstLarge;
                secondInd = firstInd;
                firstLarge = arr[i];
                firstInd = i;
            } else if (arr[i] < firstLarge && arr[i] > secondLarge) {
                secondLarge = arr[i];
                secondInd = i;
            }
        }
        return secondInd;  // -1 if no second largest exists
    }

    public static void main(String[] args) {
        int [] arr = {10, 7, 18,61,21,18,19};
        System.out.println(secondSmallestInArray(arr));
        System.out.println(indOfSecondSmallestInArray(arr));
        System.out.println(secondLargestInArray(arr));
        System.out.println(indOfSecondSmallestInArray(arr));
    }
}
