package Patterns;

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6, i, j;

		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
