package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercise_59 {

	public static void main(String[] args) {
		
		Scanner reader =new Scanner(System.in);
		
		ArrayList<String> teachers = new ArrayList<String>();
		
		String word;
		
		do {
			System.out.println("Type a word:");
			word = reader.nextLine();
			teachers.add(word);
			
		} while (!word.isEmpty());
		System.out.println("You type the following words:");
		Collections.reverse(teachers);
	    for (String teacher : teachers) {
	        System.out.println( teacher );
	    }
	}
	
}
