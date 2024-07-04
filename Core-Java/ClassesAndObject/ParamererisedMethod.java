package ClassesAndObject;

import java.util.Scanner;

public class ParamererisedMethod {

	public void mul(int a, int b)
	{
		System.out.println("Multiplication is : "+(a*b));
	}
	public double div(double a, double b)
	{	
		return (a/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two no. : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		ParamererisedMethod obj = new ParamererisedMethod();
		obj.mul(a,b);
		double res = obj.div(3.2, 2.2);
		System.out.println("Division is : "+res);
	}

}
