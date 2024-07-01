package PracticeProgramDay1;
import java.util.Scanner;

public class _2_Area {
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			double r;
			System.out.println("Enter the radius value : ");
			r = sc.nextDouble();
			double circleArea = Math.PI * r * r;
			System.out.println("Circle Area is :"+circleArea);
			
			
		    int b,h;
			System.out.println("\nEnter the base : ");
			b = sc.nextInt();
			System.out.println("Enter the height : ");
			h = sc.nextInt();
			int triangleArea = (b * h) /2;
			System.out.println("Triangle area is : "+ triangleArea);
			
			
			int l,w;
			System.out.println("\nEnter the value of length: ");
			l = sc.nextInt();
			System.out.println("Enter the value of width: ");
			w = sc.nextInt();
			int rectangleArea = l * w;
			System.out.println("Rectangle area  is : "+rectangleArea);
			
		}
		

}
