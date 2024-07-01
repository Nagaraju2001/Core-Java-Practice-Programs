package basic;

public class VariableDemo {
	
	int a=5;
	
	void print()
	{
		int a=10;
		System.out.println(a);     //  short cut for syso ctrl+space
	}

	public static void main(String[] args) {
		
		int a=20;
		
		VariableDemo fp = new VariableDemo();
		fp.print();
		
		System.out.println(a);
		
	}

}
