package basic;

import java.util.Scanner;

// 1.perform all arithmetic operator

//public class PracticeProgram {
//
//	public static void main(String[] args) {
//	int a,b;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter 2 number");
//		a = sc.nextInt();
//		b = sc.nextInt();
//
//		int add = a + b;
//		System.out.println("Addition is : " +add);
//		int sub = a - b;
//		System.out.println("Subtraction is : " +sub);
//		int mul = a * b;
//		System.out.println("Multiplication is : " +mul);
//		int div = a / b;
//		System.out.println("Division is : " +div);
//	}
//
//}




// 2.Calculate area of circle, rectangle and triangle

//public class PracticeProgram {
//
//	public static void main(String[] args) {
//	
//		Scanner sc = new Scanner(System.in);
//		
//		double r;
//		System.out.println("Enter the radius value : ");
//		r = sc.nextDouble();
//		double circleArea = Math.PI * r * r;
//		System.out.println("Circle Area is :"+circleArea);
//		
//		
//	    int b,h;
//		System.out.println("\nEnter the base : ");
//		b = sc.nextInt();
//		System.out.println("Enter the height : ");
//		h = sc.nextInt();
//		int triangleArea = (b * h) /2;
//		System.out.println("Triangle area is : "+ triangleArea);
//		
//		
//		int l,w;
//		System.out.println("\nEnter the value of length: ");
//		l = sc.nextInt();
//		System.out.println("Enter the value of width: ");
//		w = sc.nextInt();
//		int rectangleArea = l * w;
//		System.out.println("Rectangle area  is : "+rectangleArea);
//		
//	}
//	
//}

//3. Calculate simple interest

//public class PracticeProgram {
////
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the Investment Amount: ");
//		int PrincipleAmount = sc.nextInt();
//		System.out.println("Enter the interent rate: ");
//		float Interest = sc.nextInt();
//		System.out.println("Enter time : ");
//		int time = sc.nextInt();
//		
//		float simpleInterest =( PrincipleAmount * Interest * time)/100;  //(PrincipleAmount * Interest * time)/100;
//		System.out.println("Simple Interest is : "+ simpleInterest);
//	
//	}

//}



public class PracticeProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Investment Amount: ");
		int PrincipleAmount = sc.nextInt();
		System.out.println("Enter the interent rate: ");
		float Interest = sc.nextInt();
		System.out.println("Enter time : ");
		int time = sc.nextInt();
		
		float simpleInterest =( PrincipleAmount * Interest * time)/100;  //(PrincipleAmount * Interest * time)/100;
		System.out.println("Simple Interest is : "+ simpleInterest);
	
	}

}


