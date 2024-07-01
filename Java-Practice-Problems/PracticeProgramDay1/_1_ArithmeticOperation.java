package PracticeProgramDay1;
import java.util.Scanner;

public class _1_ArithmeticOperation {
	

	public static void main(String[] args) {
		int a,b;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter 2 number");
			a = sc.nextInt();
			b = sc.nextInt();
	
			int add = a + b;
			System.out.println("Addition is : " +add);
			int sub = a - b;
			System.out.println("Subtraction is : " +sub);
			int mul = a * b;
			System.out.println("Multiplication is : " +mul);
			int div = a / b;
			System.out.println("Division is : " +div);
		}
	

}
