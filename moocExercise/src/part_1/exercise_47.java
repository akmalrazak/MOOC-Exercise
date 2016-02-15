package part_1;

import java.util.Scanner;

public class exercise_47 {
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Type your name:");
		String name = reader.nextLine();
		System.out.println("Number of characters: "+calculateCharacters(name));
	
	}
	
	public static int calculateCharacters(String text){
		return text.length();
	}

}
