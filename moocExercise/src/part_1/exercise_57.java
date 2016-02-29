package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise_57 {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		
		Scanner reader = new Scanner(System.in);
		
		String word;
		do {
			System.out.println("Type a word:");
			word = reader.nextLine();
			words.add(word);
		} while (!word.isEmpty());
		System.out.println("You type the following words:");
			for (String text : words){
				System.out.println(text);
			}
	}
	
}