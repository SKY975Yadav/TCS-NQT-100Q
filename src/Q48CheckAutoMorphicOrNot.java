
public class Q48CheckAutoMorphicOrNot {

    public static boolean isAutoMorphic(int N){
        int sq = N * N;

        while (N > 0) {

            // Check if last digit is equal or not
            if (N % 10 != sq % 10)
                return false;

            // Reducing the number and its square
            N /= 10;
            sq /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 25;
        if(isAutoMorphic(n))
            System.out.println("AutoMorphic Number");
        else
            System.out.println("Not AutoMorphic Number");
    }
}
