//reverse the element in given array, arr = [12,3,56,17,21] => [21,17,56,3,12]
public class Q4ReverseGivenArray {

    public static void reverse(int [] arr){
        int n = arr.length;
        int start=0,end=n-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] arr = {12,6,87,16,31,26};
        for (int x : arr){
            System.out.print(x+" ");
        }
        reverse(arr);
        System.out.println();
        for (int x: arr){
            System.out.print(x+" ");
        }
    }
}
