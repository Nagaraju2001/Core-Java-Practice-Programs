package PracticeProgramDay2;

import java.util.Scanner;

public class Neg_pos_zero {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		num = sc.nextInt();

		if (num < 0) {
			System.out.println("It is Negetive number");
		} else if (num > 0) {
			System.out.println("It is Positive number");
		} else {
			System.out.println("It is Zero number");
		}

	}

}
