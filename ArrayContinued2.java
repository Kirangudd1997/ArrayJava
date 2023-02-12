/*problem Statement
Given an array A of N integers, find whether there exists three consecutive same integers in the array.
Input
The first line of the input contains an integer N.
The second line contains N space separated integers of the array A.

Constraints
3 <= N <= 1000
1 <= A[i] <= 100
Output
Output "Yes" if there exists three consecutive equal integers in the array, else output "No" (without quotes).
Example
Sample Input
5
1 2 2 2 4

Sample Output
Yes
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-2;i++)
		{
			if((a[i]==a[i+1]) && a[i+1]==a[i+2])
			{
				temp =1;
			}
		}
		
		if(temp==1)
		{
				System.out.print("Yes");
			
		}
		else
		{
			System.out.print("No");
		}
		
                      // Your code here
	}
}
