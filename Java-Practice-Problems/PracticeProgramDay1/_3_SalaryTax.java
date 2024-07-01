package PracticeProgramDay1;

import java.util.Scanner;

public class _3_SalaryTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the tax rate: ");
		int sal = sc.nextInt();

		int perc = (sal * 12) / 100;
		System.out.println("Pecentage is Salary amount : " + perc);
	}
}