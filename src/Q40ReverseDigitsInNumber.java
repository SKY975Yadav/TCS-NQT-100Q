public class Q40ReverseDigitsInNumber {
    public static int reverseDigit(int n){
        int res = 0;
        while (n>0){
            res = (res * 10) + (n%10);
            n = n/10;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(reverseDigit(100));
    }
}
