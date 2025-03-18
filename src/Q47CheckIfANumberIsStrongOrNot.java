/*
Problem Statement: Given an integer Print “YES” if it is a strong number else print “NO”.

Note :

When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number.
Strong number is also known as Krishnamurthi number/Peterson Number.
 */
public class Q47CheckIfANumberIsStrongOrNot {

    public static int factIterative(int n){
        int res = 1;
        for (int i=2;i<=n;i++){
            res = res*i;
        }
        return res;
    }

    public static boolean isStrong(int num){
        int sum = 0,n=num;

        while (n>0){
            int digit = n%10;
            sum += factIterative(digit);
             n = n/10;
        }
        return num == sum;
    }

    public static void main(String[] args) {

    }
}
