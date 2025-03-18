public class Q43FactorialOfAGivenNumber {
    // Using Recursion
    public static int fact(int n){
        if (n==1) return n;
        return n * fact(n-1);
    }

    public static int factIterative(int n){
        int res = 1;
        for (int i=2;i<=n;i++){
            res = res*i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fact(2));
        System.out.println(factIterative(2));
    }
}
