public class Q44PowerOfANumber {
    //Iterative
    public static int power(int n,int k){ // K is the power
        int res = 1;
        for (int i=0; i<k; i++){
            res = res * n;
        }
        return res;
    }

    public static int pow(int n,int k){
        if (k==1) return n;
        return n*pow(n,k-1);
    }

    public static void main(String[] args) {
        System.out.println(pow(5,2));
        System.out.println(power(5,2));
    }
}
