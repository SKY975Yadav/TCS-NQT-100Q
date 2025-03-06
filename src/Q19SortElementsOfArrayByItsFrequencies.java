/*
Sort Elements of an Array by Frequency

Problem Statement: Given an array of integers, having some duplicate elements, sort the array by frequency.

Examples:

Example 1:
Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
Output: 2 2 2 1 1 3 3 4
Explanation: Since  2 is present 3 times in an array , so print it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it will be printed at last.

Example 2:
Input: N = 6, array[] = {-199,6,7,-199,3,5}
Output: -199 -199 3 5 6 7
Explanation: Since -199 is present 2 times so it will be printed at first , then 3 , 5 ,6 ,7 are present once in array , so print them in their sorted order.
 */
import java.util.*;

public class Q19SortElementsOfArrayByItsFrequencies {

    public static void sortByFreq(int [] arr){
        // Step 1: Count frequency using HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x: arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        // Step 2: Convert Map to List of Entries
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        // Step 3: Sort by frequency (descending) and by value (ascending if frequency is same)
        list.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); // Sort by frequency (descending)
            } else {
                return a.getKey() - b.getKey(); // Sort by value (ascending) if frequencies are same
            }
        });

        // Step 4: Reconstruct the sorted array
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            int value = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                arr[index++] = value;
            }
        }

    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,2,4,3,1,2};
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
        System.out.println();
        sortByFreq(arr);
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
    }
}
