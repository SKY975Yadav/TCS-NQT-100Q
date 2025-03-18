public class Q49GCD {

//    public static int gcd(int a, int b) {
//        return (b == 0) ? a : gcd(b, a % b); // Recursive call
//    }

    public static int gcd(int a, int b) {
        while (b != 0) {
//            System.out.println(a+" "+b);
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(125,275));
    }
}
