/*Problem Statement
There are N buildings in a row with different heights H[i] (1 <= i <= N).

You are standing on the left side of the first building .From this position you can see the roof of a building i if no building to the left of the ith building has a height greater than or equal to the height of the ith building.

You are asked to find the number of buildings whose roofs you can see.
Input
The first line contains N denoting number of buildings.
The next line contains N space seperated integers denoting heights of the buildings from left to right.


Constraints
1 <= N <= 100000
1 <= H[i] <= 1000000000000000
Output
The output should contain one integer which is the number of buildings whose roofs you can see.
Example
Sample input:
5
1 2 2 4 3

Sample output:
3
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//
		int a[]=new int[n];
		for(int i =0 ; i < n; i++){
			a[i] = sc.nextInt();
		}
		//
		int count = 0;
		int m=0;
		
		for(int i = 0; i < n; i++){
			if(m< a[i]){
				m = a[i];
			    count++;

		    }
        }
		System.out.println(count);
	}
}