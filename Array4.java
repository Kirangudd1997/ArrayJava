/*Problem Statement
Given an array A of size N, you need to find its maximum, 2nd maximum and 3rd maximum element.
Try solving it in O(N) per test case
Input
The first line of the input contains the number of test cases T.
For each test case, the first line of the input contains an integer N denoting the number of elements in the array A. The following line contains N (space-separated) elements of A.


Constraints:
1 <= T <= 100
3 <= N <= 106
1 <= A[i] <= 109
Note:-It is guaranteed that the sum of N over all text cases does not exceed 106
Output
For each test case, output the first, second and third maximum elements in the array.
Example
Sample Input:
3
5
1 4 2 4 5
6
1 3 5 7 9 8
7
11 22 33 44 55 66 77

Sample Output:
5 4 4
9 8 7
77 66 55
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) 
	{
        Scanner sc = new Scanner(System.in);
         int T = sc.nextInt();
		 int[] arr;		  

			for(int j=0;j<T;j++)
			{
				int n = sc.nextInt();	
				arr = new int[n];
				
				for(int i=0;i<n;i++)
				{
				arr[i] = sc.nextInt();
				}
				int first =Integer.MIN_VALUE,second =Integer.MIN_VALUE,
				third =Integer.MIN_VALUE;
				
				for(int i=0;i<n;i++)
				{
					if(arr[i]>first)
					{
						third = second;
						second = first;
						first = arr[i];
					}
					else if(arr[i]>=second)
					{	
						third = second;		
						second = arr[i];
					}
					else if(arr[i]>=third)
					{
						third = arr[i];
					}
				
				}
				System.out.print(first + " " + second + " " + third + " ");
				System.out.println();

		}

	}
}