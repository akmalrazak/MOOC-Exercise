package part_1;

import java.util.Scanner;

public class exercise_16 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type a number:");
		int number = Integer.parseInt(reader.nextLine());
		
		boolean isEven = number % 2 == 0;
		
		if (isEven) {
			System.out.println("Number "+number+" is even.");
		}
		
		else {
			System.out.println("Number "+number+" is odd.");
		}
	}
}
