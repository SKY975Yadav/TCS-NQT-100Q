import java.util.ArrayList;
import java.util.HashMap;

public class Q15FindNonRepeatingElements {

    public static ArrayList<Integer> nonRepeatingElements(int [] arr){
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        // Collect non-repeating elements
        for (int num : arr) {  // Maintain input order
            if (map.get(num) == 1) {
                res.add(num);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1, 5, 5};
        System.out.println(nonRepeatingElements(arr)); // Output: [3, 1]
    }
}
