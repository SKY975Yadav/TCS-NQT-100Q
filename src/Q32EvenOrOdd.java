public class Q32EvenOrOdd {

    public static void evenOrOdd(int n){
        if (n%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }

    //Using Bitwise
    public static void solve(int n) {
        if ((n & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String[] args) {
        evenOrOdd(10);
        evenOrOdd(7);
    }
}
