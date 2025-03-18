/*
An Arithmetic Progression (AP) is a sequence of numbers in which the difference between consecutive terms is constant. This constant difference is called the common difference (d).

General Form of an AP:
If the first term is a and the common difference is d, then the sequence is:

a,a+d,a+2d,a+3d,…
Formula for the nth term of an AP:
T(n)=a+(n−1)d

where:

T(n) = nth term

a = first term

d = common difference

n = position of the term in the sequence

Sum of the first n terms of an AP:
𝑆(𝑛) = (n/2) × (2a+(n−1)d)
or
𝑆(n) = (n/2) × (a+l) or (n × (a+l)) / 2
where:

S(n) = sum of the first
n = n terms
l = last term
l=a+(n−1)d)


 */
public class Q35SumOfAPSeries {

    public static double sumOfAP(int [] arr){
        int n = arr.length, a = arr[0],d= arr[1]-a, l = arr[n-1]; //first and last term
        return (n / 2.0) * (2.0 * a + (n - 1) * d);
//        return  (n * (a+l)) / 2.0; // sum of ap series formula
    }
}
