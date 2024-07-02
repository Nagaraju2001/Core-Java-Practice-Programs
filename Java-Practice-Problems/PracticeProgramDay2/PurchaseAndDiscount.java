package PracticeProgramDay2;

import java.util.Scanner;

public class PurchaseAndDiscount {

	public static void main(String[] args) {
		
		double PurchaceAmount, discount;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Person Salary : ");
		PurchaceAmount = sc.nextInt();

		if(PurchaceAmount >= 10000)
		{
			discount = (PurchaceAmount * 10)/100;
			System.out.println("Purchase amount is : " +PurchaceAmount+ "\n10% Discount : "+discount);
		}
		else
		{
			discount = (PurchaceAmount * 2)/100;
			System.out.println("Purchase amount is : " +PurchaceAmount+ "\n2% Discount : "+discount);
		}

	}

}
