import java.util.HashMap;
import java.util.HashSet;

public class Q26ArrayIsSubsetOfAnotherArrayOrNot {

    public static boolean isSubset(int [] A,int [] B){
        // Check whether B is Subset of A or not ,yes if all elements of B is present in A,Note: Array elements are assumed to be unique.

/*      My Approach
        HashSet<Integer> set = new HashSet<>();

        for (int x : B){
            set.add(x);
        }

        for (int x : A){
            set.remove(x);
        }
        return set.isEmpty();

 */

        HashSet<Integer> set = new HashSet<>();

        // Store all elements of A in the HashSet
        for (int x : A) {
            set.add(x);
        }

        // Check if all elements of B exist in the HashSet
        for (int x : B) {
            if (!set.contains(x)) {
                return false; // If any element of B is missing, return false
            }
        }

        return true; // All elements of B are in A

    }

    public static boolean isSubset1(int[] A, int[] B) { // for duplicates
        HashMap<Integer, Integer> freqA = new HashMap<>();

        // Count occurrences in A
        for (int x : A) {
            freqA.put(x, freqA.getOrDefault(x, 0) + 1);
        }

        // Check if B's elements exist in A with enough occurrences
        for (int x : B) {
            if (!freqA.containsKey(x)) {
                return false; // Element in B is missing from A
            }

            // Reduce count
            freqA.put(x, freqA.get(x) - 1);

            // Remove element if count reaches 0
            if (freqA.get(x) == 0) {
                freqA.remove(x);
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
