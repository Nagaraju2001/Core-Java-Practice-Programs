package stringexam;

public class UnboxingAutoboxing {

	public static void main(String[] args) {
		
		int a = 10;
		Integer obj = a; //autoboxing
		
		Integer b= 20;  //Unboxing
		int c = b;
		
		System.out.println(obj);
		System.out.println(c);
	}

}
