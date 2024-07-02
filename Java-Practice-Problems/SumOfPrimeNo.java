package Problems;

import java.util.Scanner;

public class SumOfPrimeNo {
	
	static int flag = 0;
	
	public static boolean prime(int n)
	{
		if(n <= 1)
		{
			return false;
		}
		
		for(int i=2; i<n; i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true ;
	}
	
	public static void sumPrime(int[] arr, int n)
	{
		int sum = 0;
		
		
		for(int j=0; j< n; j++) {
			
			if(prime(arr[j]))
			{
				System.out.println("prime number : "+arr[j]);
				sum += arr[j];
			}

		}

		System.out.println("Sum of prime number is : "+sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		if(n < 0) {
			System.out.println("Invalid input ");
		}
		int arr[] = new int[n];
		System.out.println("Enter the "+n+" elements : ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		sumPrime(arr,n);
	}
}
	

/*
Q.
Write a program to find the sum of the prime numbers present in the given input array.
 
Include a function named sumPrime that accepts 2 arguments and returns an int. 
The first argument is a pointer to the input array and the second argument is an int that corresponds to the size of the array. 
The function returns the sum of the prime numbers in the input array.
 
If the size of the array is negative or if any element in the array is negative, print “Invalid Input” and terminate the program.
 
Please note that 1 is neither prime nor composite.
 
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. 
The next 'n' integers correspond to the elements in the array.
Output consists of an integer.
 
Refer sample output for formatting specifications.
 
Assume that the maximum number of elements in the array is 20.
 
Sample Input 1:
5
2
4
8
9
11
 
Sample Output 1:
13
 
Sample Input 2:
-5
 
Sample Output 2:
Invalid Input
 
Sample Input 3:
5
23
2
-200
 

Sample Output 3:
Invalid Input
 */
