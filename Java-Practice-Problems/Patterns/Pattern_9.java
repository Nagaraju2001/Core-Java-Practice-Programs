package Patterns;

public class Pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6, i, j,k,m;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(k=1; k<=2*i-1; k++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		for (i = n-1; i>= 1; i--) {
			for (j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(k=1; k<=2*i-1; k++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
	}

}
