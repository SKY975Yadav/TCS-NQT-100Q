import java.util.Arrays;
import java.util.HashSet;

public class Q12RemoveDuplicatesFromUnsortedArray {

    public static int removeDuplicates(int [] arr){
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

    public static void main(String[] args) {
        int [] arr = {1,3,6,21,22,13,8,43,24,15,45,60,71,28};
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
        System.out.println();
        int k = removeDuplicates(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
