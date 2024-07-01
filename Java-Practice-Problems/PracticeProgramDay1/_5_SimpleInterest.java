package PracticeProgramDay1;
import java.util.Scanner;

public class _5_SimpleInterest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Investment Amount: ");
		int PrincipleAmount = sc.nextInt();
		System.out.println("Enter the interent rate: ");
		float Interest = sc.nextInt();
		System.out.println("Enter time : ");
		int time = sc.nextInt();
		
		float simpleInterest =( PrincipleAmount * Interest * time)/100;  
		System.out.println("Simple Interest is : "+ simpleInterest);
	
	}


}
