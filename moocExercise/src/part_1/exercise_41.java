package part_1;

import java.util.Scanner;

public class exercise_41 {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		drawNumber();
	}
	
	private static void drawNumber() {

		int count = 0;
		int number; 
	
		while (true) {
			System.out.println("Guess a number:");
			number = Integer.parseInt(reader.nextLine());
			
			if(number == 42){
				break;
			}
			
			else if (number < 42) {
				count++;
				System.out.println("The number is lesser, guesses made "+count);
			}
			
			else if (number > 42){
				count++;
				System.out.println("The number is greater, guesse made "+count);
			}	
		}
		System.out.println("Congratulations, your guess is correct!");
		
	}
}
