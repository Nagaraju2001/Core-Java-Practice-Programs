package Arrays;

import java.util.Scanner;

public class ArrayExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };

		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the size of the Array : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		System.out.println("Enter the Element : ");
		for(int i=0; i<arr.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i : a)
		{
			System.out.print(i+" ");
		}
	}

}
