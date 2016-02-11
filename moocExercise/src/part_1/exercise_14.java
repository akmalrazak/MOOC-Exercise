package part_1;

import java.util.Scanner;

public class exercise_14 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int number = Integer.parseInt(reader.nextLine());
		
		boolean isPositive = number > 0;
		
		if (isPositive) {
			System.out.println("The number is positive.");
		}
		else {
			System.out.println("The number is not positive.");
		}
	}
}
