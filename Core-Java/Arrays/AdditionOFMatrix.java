package Arrays;

import java.util.Scanner;

public class AdditionOFMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[][] a = { { 1, 2, 3 },{ 1, 2, 3 } };
//		int[][] b = { { 1, 2, 3 },{ 1, 2, 3 } };
//
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(a[i][j] + b[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		
		System.out.println("Enter the matrix 1 elements : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the matrix 2 elements : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Addition of 2 matrix is : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
