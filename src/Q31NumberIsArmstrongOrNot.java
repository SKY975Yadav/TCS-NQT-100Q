/*
Check if a number is Armstrong Number or not
228,5
Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Examples
Example 1:
Input:N = 153
Output:True
Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153
Example 2:
Input:N = 371
Output: True
Explanation: 3^3+5^3+1^3 = 27 + 343 + 1 = 371
 */
public class Q31NumberIsArmstrongOrNot {
    public static boolean isArmStrong(int n) {
//        int noOfDigits = String.valueOf(n).length(); if allow
        int noOfDigits = digits(n);

        int num = n,sum=0;
        while (num>0){
            int digit = num%10;
//            sum += Math.pow(digit, noOfDigits); // if allow
            sum = sum + power(digit,noOfDigits);
            num = num/10;
        }
        return n == sum;
    }
    private static int digits(int n){
        int count = 0;
        while (n > 0){
            count++;
            n = n/10;
        }
        return count;
    }
    private static int power(int n,int k){
        int res = 1;
        for (int i=0;i<k;i++) res = res*n;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isArmStrong(153));
    }
}
