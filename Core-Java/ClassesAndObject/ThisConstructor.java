   package ClassesAndObject;

public class ThisConstructor {

	int a; 
	String str;
	
	public ThisConstructor()
	{
		this(22);
	}
	
	public ThisConstructor(int a)
	{
		this("Hello word!!");
		this.a = a;
		System.out.println("a = "+a);
	}
	
	public ThisConstructor(String str)
	{
		this.str = str;
		System.out.println("str = "+str);
	}
	
	public static void main(String[] args) {
		
		ThisConstructor obj = new ThisConstructor();
	}

}
