package ClassesAndObject;

public class MethodOverloading {

	public void add(int a, int b)
	{
		System.out.println("Add of Numerical value : "+(a+b));
	}
	
	public static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public void add(double a, double b, double c)
	{
		System.out.println("Add of Decimal value : "+(a+b+c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.add(2, 5);
		obj.add(2.2, 5.3, 6.4);
		System.out.println("Add of Numerical value : "+add(4, 2, 7));
	}

}
