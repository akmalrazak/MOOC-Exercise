package part_1;

import java.util.Scanner;

public class exercise_50 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type your name: ");
		String name = reader.nextLine();
		System.out.println("1. character: "+FirstCharacter(name));
		System.out.println("2. character: "+SecondCharacter(name));
		System.out.println("3. character: "+ThirdCharacter(name));
	}
	
	public static char FirstCharacter(String text){
		return text.charAt(0);
	}
	
	public static char SecondCharacter(String text){
		return text.charAt(1);
	}
	
	public static  char ThirdCharacter(String text){
		return text.charAt(2);
	}
	
}
