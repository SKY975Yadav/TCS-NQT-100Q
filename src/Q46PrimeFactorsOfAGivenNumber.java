import java.util.ArrayList;

public class Q46PrimeFactorsOfAGivenNumber {

    public static ArrayList<Integer> primeFactors(int n){
        ArrayList<Integer> res = new ArrayList<>();

        // Check and add factor 2 once
        if (n % 2 == 0) {
            res.add(2);
            while (n % 2 == 0) {
                n /= 2;
            }
        }

        // Check odd factors from 3 onwards
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                res.add(i); // Add factor only once
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        // If n is still greater than 1, it is prime and must be added
        if (n > 1) {
            res.add(n);
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(primeFactors(19));
    }
}
