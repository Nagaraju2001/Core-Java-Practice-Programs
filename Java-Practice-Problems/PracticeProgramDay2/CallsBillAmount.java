package PracticeProgramDay2;

import java.util.Scanner;

public class CallsBillAmount {

	public static void main(String[] args) {
		
		double noOfCalss,billAmount;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Person Salary : ");
		noOfCalss = sc.nextInt();
		
		if(noOfCalss < 200)
			billAmount = noOfCalss * 1;
		else
			billAmount = noOfCalss * 3;
			
		System.out.println("Bill Amount is : "+billAmount);

	}

}
