/*Problem Statement
Given an array A[] of size N, containing positive integers. You need to print the sum and mean (floor value) of given numbers.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function:- SumAndMean() that takes the Array and the integer N as parameter.

Constraints:-
1 <= N <= 100
1 <= A[i] <= 100
Output
Print the Sum and the Mean of the array separated by a space.
Example
Sample Input:
5
1 2 19 28 5

Sample Output:
55 11
*/
static void SumAndMean(int arr[],int N){
   int sum=0,result;
		
		
		Scanner sc=new Scanner(System.in);
		//N=sc.nextInt();

		//for(int i=0;i<N;i++)
		//{
			//arr[i]=sc.nextInt();
		//}
		for(int i=0;i<N;i++)
		{
			sum=sum+arr[i];
			
		}
		result=sum/N;
		//result=(int)result;
		
		System.out.println(sum+" "+Math.round(result));
  //Enter your code here   
    }
