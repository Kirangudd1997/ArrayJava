/*Problem Statement
Given an array A of size N (N is always even), you need to find exactly (N/2) numbers where each number represents the pair-wise sum of consecutive elements of the array A.

In simple terms print (A[1]+A[2]), (A[3]+A[4]), ..., (A[N-1]+A[N]).
Input
The first line of the input contains the number of test cases T.

For each test case, the first line of the input contains an integer N(even number) denoting the number of elements in the array. The next line contains N (white-space separated) integers.


Constraints
1 <= N <= 100
1 <= A[I] <= 1000000000
Output
For each test case, output N/2 elements representing the pairwise sum of adjacent elements in the array.
Example
Input:-1
4
1 2 6 4

output-1
3 10
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		int n,prod=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i=i+2)
		{
			prod=a[i]+a[i+1];
			System.out.print(prod+" ");
		}
                      // Your code here
	}
}