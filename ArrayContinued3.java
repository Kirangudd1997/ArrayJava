/*Problem Statement
Given an array Arr of N integers, your task is to print the sum of elements present at even places and print the product of elements present at the odd places.

Note:- Consider the first element to start from 1.
Input
The first line of input contains a single integer N, the next line of input contains N space- separated integers depicting the values of the array.

Constraints:-
1 <= N <= 50
1 <= Arr[i] <= 5
Output
Print the sum of elements present at even places and print the product of elements present at the odd places separated by a space.
Example
Sample Input:-
5
1 2 3 4 5

Sample Output:-
6 15
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int pod=1;
        int n;
        
        n=sc.nextInt();
        int a[]=new int[n];
        
    
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
        }
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                sum=sum+a[i];
                
            }
            else
            {
                pod=pod*a[i];
                 
            }
            
        }
        System.out.println(sum+" "+pod);
                      // Your code here
	}
}