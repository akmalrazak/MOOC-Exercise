package week3;

import java.util.Scanner;

public class exercise_55 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		String found = "";
		
		System.out.println("Type the first word:");
		String first = reader.nextLine();
		
		System.out.println("Type the second word:");
		String second = reader.nextLine();
		
		
		if(first.indexOf(second)==-1){
			found = "not ";
			//System.out.println("The word '"+second+"' is "+found+" in the word '"+first+"'");
		}
		
		System.out.println("The word '"+second+"' is "+found+"found in the word '"+first+"'");

		

	
	}
	
	
}
