public class Q24SearchInArray {

    // linear search
    public static int linearSearch(int [] arr,int key){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    // Binary Search : only applicable if array is sorted
    public static int binarySearch(int [] arr,int key){
        int n = arr.length, low = 0,high = n-1;

        while (low <= high){
            int mid = (low+high)/2;

            if (arr[mid] == key) return mid;

            if (arr[mid] < key) low = mid+1;

            else high = mid-1;
        }
        return -1;

    }

    public static void main(String[] args) {
        int [] arr= {6,7,9,5,3,10};
        int [] arr1 = {1,4,7,12,15,21,26};
        System.out.println(linearSearch(arr,9));
        System.out.println(binarySearch(arr1,21));

    }
}
