package ClassesAndObject;

public class StaticMethod {

	public static void square(int a)
	{
		System.out.println("Square : "+(a*a));
	}
	public static int cube(int a)
	{
		return 3*3*3;
	}
	static
	{
		System.out.println("Statoc block invoked before main()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		square(2);
		System.out.println("Cube : "+cube(3));
	}

}
