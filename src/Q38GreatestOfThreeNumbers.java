public class Q38GreatestOfThreeNumbers {
    public static int greatestOfThree(int a,int b,int c){
        if (a>b && a>c) return a;
        else if (b>a && b>c) return b;
        else return c;

//        return Math.max(a,Math.max(b,c));
    }
}
