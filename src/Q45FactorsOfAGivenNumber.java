import java.util.ArrayList;

public class Q45FactorsOfAGivenNumber {

    //Naive Approach
    public static ArrayList<Integer> factors(int n){
        ArrayList<Integer> res = new ArrayList<>();

        for (int i=1;i<=n;i++){
            if (n%i==0) res.add(i);
        }
        return res;
    }

    //Optimized
    public static ArrayList<Integer> factorsOfNum(int n){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        res.add(n);
        for (int i=2; i*i <= n;i++){
            if (n % i == 0) {
                res.add(i); // Add the factor

                if (i != n / i) { // Add the corresponding factor
                    res.add(n / i);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(factors(12));
        System.out.println(factorsOfNum(12));
    }
}
