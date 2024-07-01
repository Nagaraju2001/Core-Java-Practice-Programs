package PracticeProgramDay1;
import java.util.Scanner;

public class _4_SubPercCal {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sub1 marks : ");
		int sub1 = sc.nextInt();
		System.out.println("Enter the sub2 marks : ");
		int sub2 = sc.nextInt();
		System.out.println("Enter the sub3 marks : ");
		int sub3 = sc.nextInt();
		
		int total = sub1+sub2+sub3;
		int perc = total / 3;
		
		System.out.println("Pecentage is : "+perc);
	}
}
