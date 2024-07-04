package PracticeProgramday3;

import java.util.Scanner;

public class SwitchVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice : ");
		String choice = sc.next();

		switch (choice) {
		case "A":			
		case "a":	
		case "E":
		case "e":
		case "I":
		case "i":
		case "O":
		case "o":
		case "U":
		case "u":	
			System.out.println("Vowel");
			break;
		
		default:
			System.out.println("Consonant");
		}

	}

}
