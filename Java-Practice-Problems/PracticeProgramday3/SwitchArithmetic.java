package PracticeProgramday3;

import java.util.Scanner;

public class SwitchArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two number : ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println(
				"Type '+' to calculate Addition \nType '-' to calculate Subtraction \nType '*' to calculate Multiplication \nType '/' to calculate Division \nEnter your choice: ");
		String choice = sc.next();

		switch (choice) {
		case "+":
			System.out.println("Addition : " + (a + b));
			break;

		case "-":
			System.out.println("Addition : " + (a - b));
			break;

		case "*":
			System.out.println("Addition : " + (a * b));
			break;

		case "/":
			System.out.println("Addition : " + (a / b));
			break;

		default:
			System.out.println("Invalid choice !");
		}

	}

}
