Problem Statement
/*Given an array of N elements, your task is to update every element with multiplication of previous and next elements with following exceptions:-
a) First element is replaced by multiplication of first and second.
b) Last element is replaced by multiplication of last and second last.

See example for more clarity
Input
First line of input contains the size of array N, next line contains N space separated integers denoting values of array.

Constraints:-
2 < = N < = 100000
1 < = arr[i] < = 100000
Output
Print the modified array
Example
Sample Input :-
5
2 3 4 5 6

Sample Output:-
6 8 15 24 30
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print(a[0]*a[1]+" ");
		for(int i=0;i<n-2;i++)
		{
			System.out.print(a[i]*a[i+2]+" ");
			
		}
		System.out.print(a[n-1]*a[n-2]+" ");
                      // Your code here
	}
}