public class Q41MaxAndMinDigitInNumber {
    public static void maxAndMinDigit(int n){
        n = Math.abs(n);
        int max = 0;
        int min = 9;
        while (n>0){
            int digit = n%10;
            max = Math.max(max,digit);
            min = Math.min(min,digit);
            n = n/10;
        }
        System.out.println("largest digit : "+max);
        System.out.println("smallest digit: "+min);
    }

    public static void main(String[] args) {
        maxAndMinDigit(3425847);
    }
}
