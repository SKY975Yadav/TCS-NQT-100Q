//Sum of the array elements : [12,5,18,25,10] , sum = 70
public class Q7SumOfTheElementsInArray {

    public static int sum(int [] arr){
        int sum = 0;
        for (int x : arr){
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {12,5,18,25,10};
        System.out.println(sum(arr));
    }
}
