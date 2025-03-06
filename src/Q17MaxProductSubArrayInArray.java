// Problem Statement: Given an array that contains both negative and positive integers, find the maximum product sub array.

public class Q17MaxProductSubArrayInArray {

    public static int maxProductSubArray(int [] arr){
        if (arr.length == 0) return 0;

        int maxProduct = arr[0];
        int minProduct = arr[0]; // Track min product (needed for negative numbers)
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int tempMax = Math.max(arr[i], Math.max(maxProduct * arr[i], minProduct * arr[i]));
            minProduct = Math.min(arr[i], Math.min(maxProduct * arr[i], minProduct * arr[i]));

            maxProduct = tempMax;
            result = Math.max(result, maxProduct);
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
