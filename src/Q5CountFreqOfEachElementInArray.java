import java.util.Arrays;
import java.util.HashMap;
// count freq of each element in array ex : [1,6,8,6,1,6], 1->2,6->3,8->1
public class Q5CountFreqOfEachElementInArray {

    public static HashMap<Integer,Integer> freqOfEachElementInArray(int []arr){
        HashMap<Integer,Integer> res = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            res.put(arr[i],res.getOrDefault(arr[i],0)+1);
        }
        return  res;
    }

    public static void freqOfEachElement(int[] arr) {//if rule that don't use hashmap and contains ony +ve
        int max = Arrays.stream(arr).max().getAsInt(); // Find max element
        int[] freq = new int[max + 1]; // Create frequency array

        for (int num : arr) {
            freq[num]++; // Increment count for each element
        }

        System.out.println("Element Frequency:");
        for (int i = 0; i <= max; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {

    }
}
