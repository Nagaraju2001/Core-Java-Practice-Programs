package PracticeProgramday3;

import java.util.Scanner;

public class SwitchArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius,base,height,length,width;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice. \nType 'Circle' to calculate circle \nType 'Triangle' to calculate triangle \nType 'Rectangle' to calculate ");
		String choice = sc.next();
		
		switch(choice)
		{
		case "Circle" : 
			System.out.println("Enter the radius value : ");
			radius = sc.nextDouble();
			double circleArea = Math.PI * radius * radius;
			System.out.println("Circle Area is :"+circleArea);
			break;
			
		case "Triangle" :
			System.out.println("\nEnter the base : ");
			base = sc.nextInt();
			System.out.println("Enter the height : ");
			height = sc.nextInt();
			double triangleArea = (base * height) /2;
			System.out.println("Triangle area is : "+ triangleArea);
			break;
			
		case "Rectangle" :
			System.out.println("\nEnter the value of length: ");
			length = sc.nextInt();
			System.out.println("Enter the value of width: ");
			width = sc.nextInt();
			double rectangleArea = length * width;
			System.out.println("Rectangle area  is : "+rectangleArea);
			break;
			
		default : System.out.println("Invalid choice !");
		}
	}

}
