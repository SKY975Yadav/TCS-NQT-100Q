/*
Problem Statement: Perfect Number. Write a program to find whether a number is a perfect number or not.

A perfect number is defined as a number that is the sum of its proper divisors ( all its positive divisors excluding itself).

Examples:

Example 1:
Input: n=6
Output: 6 is a perfect number

Example 2:
Input: n=15
Output: 15 is not a perfect number

Example 3:
Input: n=28
Output: 28 is a perfect number
Reason:
For 6 and 28 , the sum of their proper divisors (1+2+3) and (1+2+4+7+14) is equal to the respective numbers and for 15 it is not.
 */
public class Q31NumberIsPerfectOrNot {
    public static boolean isPerfect(int n){
        if (n<=1) return false;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0){
                sum += i;
                if (i != n / i) sum += n / i; // Add both divisors
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(28));
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(15));
    }
}
