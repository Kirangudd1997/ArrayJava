/*Problem Statement
Equality is eternal.
Given an integer n, find out whether we can divide 1, 2, 3..., n into two sets of equal sums.
Input
The only input line contains an integer n.

Constraints
1 <= n <= 1000000000
Output
Print "YES", if the division is possible, and "NO" otherwise.
Example
Sample Input
7

Sample Output
YES
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	
        static String check(long n){
       long sum=0;
       sum=n*(n+1)/2; 
       
       
        if(sum%2!=0){
            return "NO";
        }
        else{
                return "YES";
        }
    }
    public static void main (String[] args) {
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            System.out.print(check(n));
    }
                      // Your code here
	
}
