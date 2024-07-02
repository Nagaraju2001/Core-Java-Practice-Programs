package PracticeProgramDay2;

import java.util.Scanner;

public class CalculateSubject_Percent_Grade {

	public static void main(String[] args) {
		
		int sub1,sub2,sub3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter subject 1 marks : ");
		sub1 = sc.nextInt();
		System.out.println("Enter subject 2 marks : ");
		sub2 = sc.nextInt();
		System.out.println("Enter subject 3 marks : ");
		sub3 = sc.nextInt();
		
		int total = sub1+sub2+sub3;
		int perc = total / 3;

		if (perc > 90) {
			System.out.println("Your Grade is : A+ \nPercentage is : " +perc);
		}
		else if (perc > 80 && perc < 90) {
			System.out.println("Your Grade is : A \nPercentage is : " +perc);
		}
		else if (perc > 70 && perc < 80) {
			System.out.println("Your Grade is : B+ \nPercentage is : " +perc);
		}
		else if (perc > 60 && perc < 70) {
			System.out.println("Your Grade is : B \nPercentage is : " +perc);
		}
		else if (perc > 50 && perc < 60) {
			System.out.println("Your Grade is : C+ \nPercentage is : " +perc);
		}
		else {
			System.out.println("Your Grade is : C \nPercentage is : " +perc);
		}
		

	}

}
