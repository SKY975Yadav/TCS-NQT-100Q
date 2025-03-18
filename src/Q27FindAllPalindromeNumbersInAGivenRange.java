import java.util.ArrayList;

public class Q27FindAllPalindromeNumbersInAGivenRange {

    private static boolean isPalindrome(int num){
        int temp = num;
        int revNum = 0;

        while (temp > 0){
            revNum = (revNum * 10) + (temp%10);
            temp = temp/10;
        }
        return num == revNum;
    }

    public static ArrayList<Integer> allPalindrome(int min,int max){
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (isPalindrome(i)) res.add(i);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
