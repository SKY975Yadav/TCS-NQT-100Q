//Problem Statement: Given an array of N integers, write a program to add an array
// element at the beginning, end, and at a specific position. we can assume that there is an extra space for insert element in array at the end
public class Q13AddingElementInArray {

    public static void insertAtBeginning(int [] arr,int n,int x){

        for (int i = n-1;i>0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = x;
    }

    public static void insertAtEnd(int [] arr,int n,int x){
        arr[n] = x;
    }


    //If pos is index based i.e from 0
//    public static void insertAtPosition(int[] arr, int n, int pos, int x) {
//        if (n >= arr.length || pos > n) return; // Check bounds
//
//        // Shift elements to the right
//        for (int i = n - 1; i >= pos; i--) {
//            arr[i + 1] = arr[i];
//        }
//        arr[pos] = x;
//    }

    // If pos is not index based i.e from 1
    public static void insertAtPosition(int []arr,int n,int pos,int x){
        if (n >= arr.length || pos > n + 1 || pos < 1) return;

        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos-1] =x;
    }

    public static void main(String[] args) {

    }
}
