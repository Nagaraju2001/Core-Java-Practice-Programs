package Problems;

import java.util.Scanner;

public class AvgOfMultiplesOf5 {

	public static float findAverageBy5s(int size)
	{
		float avg,count = 0, add = 0,mul = 0,i=1;
		
		while(mul != size)
		{
			mul = 5*i;
			add += mul;
			count++;
			i++;
		}
		avg = add / count;
		return avg;
	}
	
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input size : ");
		int size = sc.nextInt();
		
		if(size < 0 || size > 32767) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		
		System.out.println("Average of multiples of 5 upto 'n' is : ");
		System.out.printf("%.2f", findAverageBy5s(size));
	}

}

/*
 Write a program to find the average of multiples of 5 upto 'n'. n is given as input.
 
Include a function named findAverageBy5s that accepts an integer argument and returns a float that corresponds to the average of multiples of 5.
 
If the input value is negative or greater than 32767, print Invalid Input and terminate the program.
 
Input and Output Format:
Input consists of a single integer.
Output consists of a floating point number. Output is displayed correct to 2 decimal places.
Refer sample output for formatting specifications.
 
 
Sample Input 1:
10
 
Sample Output 1:
7.50
 
Sample Input 2:
-67
 
Sample Output 2:
Invalid Input
 */