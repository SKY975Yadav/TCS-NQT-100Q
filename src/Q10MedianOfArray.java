public class Q10MedianOfArray {

    public static double median(int [] arr){
        int n = arr.length;
        if(n%2 == 1){
            return arr[n/2];
        }
        return (arr[(n/2)-1] + arr[n/2]) / 2.0;
    }
    public static void main(String[] args) {

    }
}
