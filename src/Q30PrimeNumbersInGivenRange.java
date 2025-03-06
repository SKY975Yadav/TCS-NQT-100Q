import java.util.ArrayList;

public class Q30PrimeNumbersInGivenRange {
    public static ArrayList<Integer> primeNumbersInGivenRange(int min,int max){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if(isPrime(i)) res.add(i);
        }
        return res;
    }

    public static boolean isPrime(int n){
        if (n < 2) return false; // Handle negative numbers, 0, and 1
        if (n == 2 || n ==3) return true;

        if (n%2 ==0 || n%3 == 0) return false;

        for (int i=5; i*i <= n; i+=6){
            if (n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNumbersInGivenRange(30,75));
    }
}
