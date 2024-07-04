package ClassesAndObject;

import java.util.Scanner;

public class DefaultMethod {

	int a,b;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two no. : ");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	public void add()
	{
		System.out.println("Addition is : "+(a+b));
	}
	public int sub()
	{
		return (a-b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethod obj = new DefaultMethod();
		obj.accept();
		obj.add();
		int res = obj.sub();
		System.out.println("Subtraction is : "+res);
	}

}
