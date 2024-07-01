package Patterns;

import java.util.Scanner;

public class Pattern_2 {

	public static void pattern(int n)
	{
		int i,j,k;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		pattern(a);
		pattern(b);
		pattern(c);
	}

}

