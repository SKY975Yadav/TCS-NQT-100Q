import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Q11RemoveDuplicatesFromSortedArray {

    // Brute Force,
    public static int removeDuplicates(int [] arr){ // return the size of the distinct array
        HashSet<Integer> set = new HashSet<>();
        int index = 0;

        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                arr[index++] = num;
            }
        }

        return index; // Returns the new size of the array without duplicates
    }

    // Two Pointer Approach
    public static int removeDuplicateUsing2Pointer(int [] arr){
        int n = arr.length;
        int i=0;

        for (int j = 1; j < n; j++) {
            if (arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;

    }

    public static void main(String[] args) {
        int [] arr = {1,1,1,2,3,3,3,4,5,5,6,7,8};
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
        System.out.println();
//        int k = removeDuplicates(arr);
        int k = removeDuplicateUsing2Pointer(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
