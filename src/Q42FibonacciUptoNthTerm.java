import java.util.HashMap;
import java.util.Map;

public class Q42FibonacciUptoNthTerm {
    public static void fibonacciSeries(int n){
        int first = 0,second = 1;
        // Print Fibonacci series using a for loop
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            // Compute the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }

    //Note ind 1 based
    //finding fibonacci at nth index
    public static int fibonacciAtNth(int n){
        int first = 0,second = 1;
        // Print Fibonacci series using a for loop
        for (int i = 1; i < n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return first;
    }

    public static int fibonacciAtNthUsingRecursion(int n) {
        if (n == 1) {
            return 0; // First Fibonacci number (1-based)
        }
        if (n == 2) {
            return 1; // Second Fibonacci number (1-based)
        }
        return fibonacciAtNthUsingRecursion(n - 1) + fibonacciAtNthUsingRecursion(n - 2);
    }

    // using dp
    private static final Map<Integer, Integer> memo = new HashMap<>();
    public static int fibonacci(int n) {
        if (n == 1) return 0; // Base case: fib(1) = 0
        if (n == 2) return 1; // Base case: fib(2) = 1

        if (memo.containsKey(n)) { // If already computed, return from cache
            return memo.get(n);
        }

        int result = fibonacci(n - 1) + fibonacci(n - 2); // Compute and store
        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        fibonacciSeries(10);
    }
}
