package part_1;

import java.util.Scanner;

public class exercise_15 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age = Integer.parseInt(reader.nextLine());
		
		boolean isMajority = age >= 18;
		
		if (isMajority) {
			System.out.println("You have reached the age of majority!");
		}
		
		else {
			System.out.println("You have not reached the age of majority yet!");
		}
	}
}
