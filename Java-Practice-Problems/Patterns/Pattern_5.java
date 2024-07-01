package Patterns;

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6, i, j,c=1;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}

}
