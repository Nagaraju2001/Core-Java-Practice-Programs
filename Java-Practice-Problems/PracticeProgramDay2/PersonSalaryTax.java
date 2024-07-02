package PracticeProgramDay2;

import java.util.Scanner;

public class PersonSalaryTax {

	public static void main(String[] args) {

		int income,amount;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Person Salary : ");
		income = sc.nextInt();

		if (income < 25000) {
			amount = (income * 10) / 100;
			System.out.println("Your income is : " + income + "\nYour tax amount is : " + amount);
		} else {
			amount = (income * 15) / 100;
			System.out.println("Your income is : " + income + "\nYour tax amount is : " + amount);
		}

	}

}
