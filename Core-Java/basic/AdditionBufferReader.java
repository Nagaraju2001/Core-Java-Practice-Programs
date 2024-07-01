package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionBufferReader {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int a, b;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbeers : ");
		a = Integer.parseInt(reader.readLine());
		b = Integer.parseInt(reader.readLine());

		int add = a + b;
		System.out.println("Addition is : " + add);
		int sub = a - b;
		System.out.println("Subtraction is : " + sub);
		int mul = a * b;
		System.out.println("Multiplication is : " + mul);
		int div = a / b;
		System.out.println("Division is : " + div);
	}

}
