/*
Sum of n terms in gp series = a(r^n - 1)/(r-1)
 */
public class Q36SumOfGPSeries {

    public static double sumOfGPSeries(int [] arr){
        int a = arr[0], n = arr.length;
        double r = (double) arr[1] / arr[0]; // Corrected: Finding common ratio properly

        // Handling the case where r = 1 to prevent division by zero
        if (r == 1) {
            return n * a;
        }

        return a * (Math.pow(r, n) - 1) / (r - 1); // Corrected: Using division instead of modulus
    }
    public static void main(String[] args) {
        System.out.println(sumOfGPSeries(new int[]{2,4,8,16}));
    }
}
