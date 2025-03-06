import java.util.Arrays;
import java.util.HashMap;

/*
    Problem Statement: Given an array of N integers, the task is to replace each element of the array by its rank in the array.

Examples:

Example 1:
Input: 20 15 26 2 98 6
Output: 4 3 5 1 6 2
Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…

Example 2:
Input: 1 5 8 15 8 25 9
Output: 1 2 3 5 3 6 4
Explanation: When sorted,the array is 1,5,8,8,9,15,25. So the rank of 1 is 1,rank of 5 is 2,rank of 8 is 3 and so…
 */
public class Q18ReplaceEachElementInArrayByItsRankInArray {

    public static void replace(int [] arr){
        int n = arr.length;
        int[] temp = arr.clone(); // Clone the original array
        Arrays.sort(temp); // Sort the copy for ranking

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int num : temp) {
            if (!map.containsKey(num)) {
                map.put(num, rank++); // Assign rank starting from 1
            }
        }

        // Replace elements in arr with their ranks
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }

    }

    public static void main(String[] args) {
        int [] arr = {1, 5, 8,15, 8, 25, 9};
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
        System.out.println();
        replace(arr);
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
    }
}
