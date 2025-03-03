// Rearrange the array element such as first half in sorted in increasing order and second half in decreasing order
// Ex ; [15,78,19,21,91,14,7,25] = [7,14,15,19, 91,78,25,21], if odd no.of elements then include middle element in first half

import java.util.Arrays;

public class Q6RearrangeTheArrayInIncAndDecOrder {

    public static void rearrangeInIncAndDecOrder(int [] arr){
        int n = arr.length;
        Arrays.sort(arr);
        reverse(arr,n/2,n-1);
    }
    private static void reverse(int [] arr,int i,int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;j--;
        }
    }

    public static void main(String[] args) {
        int [] arr = {15,78,19,21,91,14,7,25};
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
        rearrangeInIncAndDecOrder(arr);
        System.out.println();
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));

    }
}
