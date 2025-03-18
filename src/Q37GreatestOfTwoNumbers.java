public class Q37GreatestOfTwoNumbers {
    public static int greatestOfTwoNumbers(int a,int b){
        if (a>b) return a;
        else return b;

//        return Math.max(a,b);
    }
    public static void main(String[] args) {
        System.out.println(greatestOfTwoNumbers(10,-23));
    }
}
