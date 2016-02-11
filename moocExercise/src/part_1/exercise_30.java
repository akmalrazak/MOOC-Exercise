package part_1;

import java.util.Scanner;

public class exercise_30 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int number = 1;
		
		System.out.println("Up to what number?");
		int num = Integer.parseInt(reader.nextLine());
		
		while (number <= num) {
			System.out.println(number);
			number++;
		}
	}
}
