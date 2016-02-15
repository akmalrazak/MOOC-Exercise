package part_1;

import java.util.Scanner;

public class exercise_51 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type your name: ");
		String name = reader.nextLine();

		int i = 0;
		while (i < name.length()) {
			System.out.println("character : "+Character(i,name));
			i++;
		}	
	}
	
	public static char Character(int i, String text){
		return text.charAt(i);
	}
}

