package PracticeProgramDay2;

import java.util.Scanner;

public class DisplayGreatestNumber {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number 1 : ");
		num1 = sc.nextInt();
		System.out.println("Enter a Number 2 : ");
		num2 = sc.nextInt();
		System.out.println("Enter a Number 3 : ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("Greatest number is : " +num1);
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("Greatest number is : " +num2);
		}
		else 
		{
			System.out.println("Greatest number is : " +num3);
		}
	}

}
