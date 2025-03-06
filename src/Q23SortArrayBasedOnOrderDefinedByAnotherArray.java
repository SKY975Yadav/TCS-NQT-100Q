import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q23SortArrayBasedOnOrderDefinedByAnotherArray {

    public static void sortByOrder(int[] A, int[] B) {
        // Step 1: Store the order of elements from B in a HashMap
        Map<Integer, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            orderMap.put(B[i], i); // Store element and its index in B
        }

        // Step 2: Sort A using a custom comparator
        Integer[] arrObj = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Arrays.sort(arrObj, (x, y) -> {
            if (orderMap.containsKey(x) && orderMap.containsKey(y)) {
                return orderMap.get(x) - orderMap.get(y); // Sort by B's order
            } else if (orderMap.containsKey(x)) {
                return -1; // x comes first
            } else if (orderMap.containsKey(y)) {
                return 1; // y comes first
            } else {
                return Integer.compare(x, y); // Sort remaining elements in ascending order
            }
        });
    }
    public static void main(String[] args) {

    }
}
