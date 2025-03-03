public class Q9AverageOfElementsInArray {

    public static double average(int [] arr){
        double sum = 0;
        int n = arr.length;
        for (int j : arr) {
            sum += j;
        }
        return sum / n;
    }

    public static void main(String[] args) {
        int [] arr = {23,11,1,6,12,19};
        System.out.println(average(arr));
    }
}
