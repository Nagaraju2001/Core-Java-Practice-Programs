package basic;

import java.util.Scanner;

public class DoWhielLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		char ch;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter 2 number");
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println("Addition is :" + (a + b));
			System.out.println("press y to contiue :");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

}
