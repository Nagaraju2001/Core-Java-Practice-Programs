package Patterns;

public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6, i, j,k,m;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for(k=i; k>=1; k--)
			{
				System.out.print(k+" ");
			}
			for(m=2; m<=i; m++)
			{
					System.out.print(m+" ");
			}
			System.out.println();
		}
	}

}
