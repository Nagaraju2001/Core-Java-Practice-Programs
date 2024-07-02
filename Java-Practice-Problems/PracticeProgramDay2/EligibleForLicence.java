package PracticeProgramDay2;

import java.util.Scanner;

public class EligibleForLicence {

	public static void main(String[] args) {

		int age;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age of Person : ");
		age = sc.nextInt();

		if (age > 18) {
			System.out.println("Person is eligible for License");
		} else {
			System.out.println("Person is not eligible for License");
		}

	}

}
