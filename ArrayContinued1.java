/*Problem Statement
Abhijit has an Array Arr which may or may not be in strictly increasing order. He wants to make this array increasing but does not wish to change the position of any element so he came with an idea that he will replace an element with any of its divisors i.e he changes an element X to M if X%M=0.

Your task is to tell whether the given array can be transformed to strictly increasing by performing the operation given above.
Input
First line of input contains the size of the array N. Next line of input contains N space- separated integers depicting the values of the array Arr.

Constraints:-
1 <= N <= 100000
1 <= Arr[i] <= 100000
Output
Print "YES" if the array can be transformed in the strictly increasing order else print "NO".
Example
Sample Input:-
5
1 2 16 16 16

Sample Output:-
YES
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  int n;
					  Scanner sc = new Scanner(System.in);
					  n = sc.nextInt();
					  int arr[] = new int[n];
					  for(int i=0;i<n;i++)
					  {
						  arr[i] = sc.nextInt();

					  }
					  String s = countNum(arr,n);
					  System.out.println(s);
	}
	      static String countNum(int arr[],int n)
		  {				  
					  int count =2;
					  for(int i=1;i<n;i++)
					  {
						  while(count<=arr[i] &&  arr[i]%count !=0)
						  {
							  count++;
						  }
						  if(count>arr[i])
						  {
							  return "NO";
							  
						  }
						  count++;
					  }
					  return "YES";
	       } 
}