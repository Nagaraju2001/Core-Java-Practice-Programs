package stringexam;


public class StringMethods {

	public static void main(String[] args) {
		
		String s1 = "Welcome";
		String s3= "Hello", s4 = "    Welcome to EduBridge    ";
		String s2 = new String("Rehana");
		
		System.out.println(s1);
		System.out.println(s2);

		//string methods

		System.out.println("Length: "+s1.length());

		System.out.println("character at 3rd index: "+s1.charAt(3));

		System.out.println("Substring: "+s1.substring(3)); 
		
		System.out.println("Substring(2,6): "+s1.substring(2,6));

		System.out.println("contains(a): "+s1.contains("a"));

		System.out.println("equals: "+s1.equals("welcome"));

		System.out.println("equalsIgnoreCase: "+s1.equalsIgnoreCase("welcome"));

		System.out.println("isEmpty()? "+s3.isEmpty());

		System.out.println("index(H): "+s1.indexOf("H"));
		
		System.out.println("index(e): "+s1.indexOf("e"));
		
		System.out.println("indexOf(e): "+s1.indexOf("e",2));

		System.out.println("lastIndexOf(e): "+s1.lastIndexOf("e"));

		System.out.println("concat(): "+s3.concat("User"));

		System.out.println(s3);

		s3 = s3.concat("User");

		System.out.println(s3);

		System.out.println("replace: "+s1.replace("Welcome", "Hello")); 
		
		System.out.println("Uppercase: "+s1.toUpperCase());

		System.out.println("lowercase: "+s1.toLowerCase());

		//trim(): removes leading and trailing spaces 
		System.out.println("length before trim(): "+s4.length());

		s4=s4.trim();

		System.out.println("length after trim(): "+s4.length());
		System.out.println(s4);
		//split

		String splitedString[] = s4.split(" ");
		for(int i=0; i<splitedString.length; i++)
		{
			System.out.println(splitedString[i]);
		}
		
		System.out.println(splitedString.length);
		
		
		StringBuffer buffer = new StringBuffer("Edu Bridge Learnign.");
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("Java full stack");
		System.out.println(builder);
	}

}
