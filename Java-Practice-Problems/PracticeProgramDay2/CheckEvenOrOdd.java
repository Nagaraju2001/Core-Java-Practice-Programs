package PracticeProgramDay2;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("It is Even number");
		} else {
			System.out.println("It is Odd number");
		}

	}
}
