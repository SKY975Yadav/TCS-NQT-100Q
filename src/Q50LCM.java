public class Q50LCM {
    public static int gcd(int a, int b) {
        while (b != 0) {
//            System.out.println(a+" "+b);
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a,int b){
        return (a * b) / gcd(a,b);
    }
    public static void main(String[] args) {
        System.out.println(lcm(120,90));
    }
}
