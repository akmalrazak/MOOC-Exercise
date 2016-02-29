package week3;

import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class exercise_54 {

	public static void main(String[] args) {
			
			Scanner reader = new Scanner(System.in);
			
			System.out.println("Type a word:");
			String word = reader.nextLine();
			
			System.out.println("Length of the end part:");
			int length = Integer.parseInt(reader.nextLine());
			
			System.out.println("Result :"+substring(word,length));
			
		}

	public static String substring(String word, int length){
		return word.substring(word.length()-length,word.length());
	}
	
}
