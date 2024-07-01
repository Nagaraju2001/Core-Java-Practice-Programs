package Patterns;

public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6, i, j,k;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for(k=1; k<=n; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
