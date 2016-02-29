package week3;

import java.util.Scanner;

public class exercise_53 {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type a word:");
		String word = reader.nextLine();
		
		System.out.println("Length of the first part:");
		int last = reader.nextInt();
		
		System.out.println("Result :"+word.substring(0, last));
		
	}

}
