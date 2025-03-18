public class Q33NumberIsPositiveOrNegative {

    public static void isPositiveOrNegative(int n){
        if (n<0) System.out.println("Negative");
        else if (n>0) System.out.println("Positive");
        else System.out.println("Zero");
    }

    public static void check(int n) {
        if (n >> 31 == 0) {
            System.out.println("Positive.");
        } else if (n >> 31 == -1) {
            System.out.println("Negative.");
        }

    }

    public static void main(String[] args) {
        isPositiveOrNegative(5);
        isPositiveOrNegative(-12);
        check(10);
        check(-234);
    }
}
